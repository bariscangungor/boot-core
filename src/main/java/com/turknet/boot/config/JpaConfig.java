package com.turknet.boot.config;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.turknet.boot.repository") 
@EntityScan(basePackages = "com.turknet.boot.model")
public class JpaConfig {

}
