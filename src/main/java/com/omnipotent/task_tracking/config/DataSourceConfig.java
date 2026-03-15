package com.omnipotent.task_tracking.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//@EnableConfigurationProperties(DatabaseProperties.class)
@Configuration
public class DataSourceConfig {
    /*7️⃣ Quick Summary
    You do not manually call DataSourceConfig.
    Spring Boot automatically:
    1️⃣ Scans @Configuration classes
    2️⃣ Enables DatabaseProperties binding
    3️⃣ Reads values from application.yml
    4️⃣ Injects them into your beans*/
    @Bean
    public DataSource dataSource(DatabaseProperties props) {

        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl(props.getUrl());
        ds.setUsername(props.getUsername());
        ds.setPassword(props.getPassword());
        ds.setDriverClassName(props.getDriverClassName());

        DatabaseProperties.Hikari hikari = props.getHikari();

        ds.setMaximumPoolSize(hikari.getMaximumPoolSize());
        ds.setMinimumIdle(hikari.getMinimumIdle());
        ds.setIdleTimeout(hikari.getIdleTimeout());
        ds.setMaxLifetime(hikari.getMaxLifetime());
        ds.setLeakDetectionThreshold(hikari.getLeakDetectionThreshold());

        return ds;
    }
}