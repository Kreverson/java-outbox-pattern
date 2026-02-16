package com.patterns.outbox;

import org.springframework.boot.SpringApplication;

public class TestOutboxApplication {

	public static void main(String[] args) {
		SpringApplication.from(OutboxApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
