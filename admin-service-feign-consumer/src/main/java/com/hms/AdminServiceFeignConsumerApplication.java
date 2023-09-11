package com.hms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@EnableFeignClients
@SpringBootApplication
public class AdminServiceFeignConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminServiceFeignConsumerApplication.class, args);
	}

	@Bean
	public Sampler getSample() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
