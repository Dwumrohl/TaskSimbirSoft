package com.example.TaskSimbirSoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class TaskSimbirSoftApplication {

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/housing_and_utilities_app");
		dataSource.setUsername("postgres");
		dataSource.setPassword("12345");
		return dataSource;
	}


	public static void main(String[] args) {
		SpringApplication.run(TaskSimbirSoftApplication.class, args);
	}

}
