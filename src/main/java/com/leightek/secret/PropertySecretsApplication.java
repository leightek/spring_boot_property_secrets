package com.leightek.secret;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(NotionConfigProperties.class)
public class PropertySecretsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertySecretsApplication.class, args);
	}

}
