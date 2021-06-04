package org.iesvalleinclan.sccs2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Sccs2Application {

	public static void main(String[] args) {
		SpringApplication.run(Sccs2Application.class, args);
	}

}
