package com.zooplus.fumbliebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class FumblieBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FumblieBackendApplication.class, args);
	}
}
