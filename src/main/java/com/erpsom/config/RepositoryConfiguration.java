package com.erpsom.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by HMO SmartClinic Ninja Development Team on 10/2/16.
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.erpsom.domain"})
@EnableJpaRepositories(basePackages = {"com.erpsom.repository"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
