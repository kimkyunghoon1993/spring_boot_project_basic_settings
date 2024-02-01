package com.portolio.employment_homepage;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching(proxyTargetClass = true)
@Slf4j
@EnableScheduling
public class PortfolioRecruitmentHomepageApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioRecruitmentHomepageApplication.class, args);
	}

	@Bean
	CommandLineRunner init() {
		return (String[] args) -> {
			log.info("포트폴리오 채용 홈페이지 실행 완료");
		};
	}

}
