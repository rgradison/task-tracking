package com.omnipotent.task_tracking.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean
    public DataSource dataSource(DatabaseProperties props) {

        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl(props.url());
        ds.setUsername(props.username());
        ds.setPassword(props.password());
        ds.setDriverClassName(props.driverClassName());

        ds.setMaximumPoolSize(props.hikari().maximumPoolSize());

        return ds;
    }
}