package com.turknet.boot.config;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.convert.CustomConversions;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

@Configuration 
@EnableMongoRepositories("com.turknet.boot.repository")
@EnableMongoAuditing 
public class MongoConfig extends AbstractMongoConfiguration {
	
	@Value("${spring.data.mongodb.host:localhost}")
    private String host;
    @Value("${spring.data.mongodb.port:27017}")
    private Integer port;
    @Value("${spring.data.mongodb.database:test}")
    private String database;
    @Value("${spring.data.mongodb.uri}")
    private String uri;
    
    @Value("${spring.data.mongodb.username:test}")
    private String username;
    @Value("${spring.data.mongodb.password:root}")
    private String password;
    @Override
    
    @Bean(name = "mongoDBConversions")
    public CustomConversions customConversions() {
        return new CustomConversions(Collections.emptyList());
    }
    
    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
      MongoClient client = new MongoClient();
      return new MongoTemplate(new SimpleMongoDbFactory(client, database));
    }

    @Bean
    public MongoMappingContext mappingContext() {
      return new MongoMappingContext();
    } 
    
	@Override
	protected String getDatabaseName() {
		return database;
	}

	@Override
	public Mongo mongo() throws Exception {
        return new MongoClient(new MongoClientURI(uri));
        
        /**
        return new MongoClient(singletonList(new ServerAddress(host, port)),
                singletonList(MongoCredential.createCredential(username,database, password.toCharArray())));
                **/
	} 
}
