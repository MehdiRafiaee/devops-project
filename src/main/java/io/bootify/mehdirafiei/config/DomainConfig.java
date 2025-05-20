package io.bootify.mehdirafiei.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("io.bootify.mehdirafiei.domain")
@EnableJpaRepositories("io.bootify.mehdirafiei.repos")
@EnableTransactionManagement
public class DomainConfig {
}
