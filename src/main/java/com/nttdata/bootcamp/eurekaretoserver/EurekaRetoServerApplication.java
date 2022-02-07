package com.nttdata.bootcamp.eurekaretoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EurekaRetoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaRetoServerApplication.class, args);
	}

}
