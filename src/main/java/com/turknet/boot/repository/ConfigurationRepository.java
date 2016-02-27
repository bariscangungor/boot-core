package com.turknet.boot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.turknet.boot.model.infrastructure.Configuration;

@RepositoryRestResource
public interface ConfigurationRepository  extends CrudRepository<Configuration, Long> {

    List<Configuration> findByConfigurationId(@Param("id") Long id);
}
