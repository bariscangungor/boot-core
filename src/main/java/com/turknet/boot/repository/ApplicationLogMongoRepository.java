package com.turknet.boot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.turknet.boot.model.ApplicationLog;
 
@RepositoryRestResource
public interface ApplicationLogMongoRepository  extends MongoRepository<ApplicationLog, String> {

    List<ApplicationLog> findBySeverity(@Param("severity") String severity);
}
