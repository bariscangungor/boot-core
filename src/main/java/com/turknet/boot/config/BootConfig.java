package com.turknet.boot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;

import com.turknet.boot.model.ApplicationLog;
import com.turknet.boot.repository.ApplicationLogMongoRepository;
import com.turknet.boot.repository.ConfigurationRepository;
 
@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.turknet.boot.repository")
//@EnableMongoRepositories(basePackages = "com.turknet.boot.repository")
//@EntityScan(basePackages = "com.turknet.boot.model")
public class BootConfig {

	@Autowired
	private ConfigurationRepository confRepo;
	@Autowired
	private ApplicationLogMongoRepository applicationLogRepository;
	
    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {
    	
    	ApplicationLog log = new ApplicationLog();
    	log.setMessage("test");
    	applicationLogRepository.save(log);
    	
    	String portStr = confRepo.findByConfigurationId(1L).get(0).getConfigValue();
    	
    	int port = org.springframework.util.StringUtils.isEmpty(portStr) ? 8013 : Integer.parseInt(portStr);
    	
        return (container -> {
            container.setPort(port);
        });
    }

	public static void main(String[] args) {
		SpringApplication.run(BootConfig.class, args);
	} 
}
