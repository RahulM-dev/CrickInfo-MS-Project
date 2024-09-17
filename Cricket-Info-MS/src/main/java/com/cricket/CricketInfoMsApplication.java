package com.cricket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.cricket.service.MatchService;
import com.cricket.service.MatchServiceImpl;

@SpringBootApplication
public class CricketInfoMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketInfoMsApplication.class, args);
	}

	@Bean
	public MatchServiceImpl matchService() {
		return new MatchServiceImpl();
	}

}
