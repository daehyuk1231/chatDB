package com.ll.chatDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ChatDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatDbApplication.class, args);
	}

}
