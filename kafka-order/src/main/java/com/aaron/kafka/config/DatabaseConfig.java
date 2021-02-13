package com.aaron.kafka.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.aaron.kafka.repository")
public class DatabaseConfig {

}
