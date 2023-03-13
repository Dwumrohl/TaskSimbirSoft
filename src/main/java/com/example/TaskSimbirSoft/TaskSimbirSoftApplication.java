package com.example.TaskSimbirSoft;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;
import java.util.Properties;

@SpringBootApplication
@EnableJpaRepositories
//@EntityScan(basePackages = {"com.example.TaskSimbirSoft.models"})
public class TaskSimbirSoftApplication {

//	@Configuration
//	public class JpaConfig {
//
//		@Bean
//		public DataSource dataSource()
//		{
//			DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//			dataSourceBuilder.driverClassName("org.postgresql.Driver");
//			dataSourceBuilder.url("jdbc:postgresql://localhost:5432/housing_and_utilities_app");
//			dataSourceBuilder.username("postgres");
//			dataSourceBuilder.password("12345");
//			return dataSourceBuilder.build();
//		}
//	}


	public static void main(String[] args) {
		SpringApplication.run(TaskSimbirSoftApplication.class, args);
	}

}
