package com.example.TaskSimbirSoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class TaskSimbirSoftApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskSimbirSoftApplication.class, args);
	}

}
