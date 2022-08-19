package com.idat.EF_JOAQUINGONZALES_CONFIGSERVER;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EfJoaquinGonzalesConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfJoaquinGonzalesConfigServerApplication.class, args);
	}

}
