package com.retail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.retail")
public class AppConfig extends WebMvcConfigurerAdapter{
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		
		Resource[] resource = new ClassPathResource[] { new ClassPathResource("foo.properties")};
		propertySourcesPlaceholderConfigurer.setLocations(resource);
		return propertySourcesPlaceholderConfigurer;
		
	}
	
	@Bean
	public ObjectMapper getObjectMapper() {
		return new ObjectMapper();
	}
}
