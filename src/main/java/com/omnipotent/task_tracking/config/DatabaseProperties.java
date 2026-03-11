package com.omnipotent.task_tracking.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.datasource")
public record DatabaseProperties(
        String url,
        String username,
        String password,
        String driverClassName,
        Hikari hikari
) {
    public record Hikari(
            int maximumPoolSize
    ) {}
}