package com.example.configProject;

import com.example.configProject.config.GlobalConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigProjectApplication implements CommandLineRunner {

	@Autowired
	private GlobalConfiguration myConfig;
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication((ConfigProjectApplication.class));
		app.run();
	}
	public void run(String... args) throws Exception{
		System.out.println("should be in here");
		System.out.println("Host : " + myConfig.getHost());
		System.out.println("Port : " + myConfig.getPort());
		System.out.println("Test config : " + myConfig.getTest().getConfig());
	}
}

