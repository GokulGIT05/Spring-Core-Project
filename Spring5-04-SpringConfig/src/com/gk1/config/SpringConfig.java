package com.gk1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.gk3.*")
@PropertySource("classpath:application.properties")
public class SpringConfig {
 
}
