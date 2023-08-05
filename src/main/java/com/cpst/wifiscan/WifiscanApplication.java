package com.cpst.wifiscan;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@RestController
@EnableWebMvc
@Slf4j
@MapperScan("com.cpst.wifiscan.mapper")
public class WifiscanApplication {

	public static void main(String[] args) {
		SpringApplication.run(WifiscanApplication.class, args);
	}

	@Bean
	public InternalResourceViewResolver viewResolver() { //解析swagerr页面加载不出来问题
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");

		log.info("http://localhost/swagger-ui/");
		log.info("http://localhost/");

		return viewResolver;
	}



	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}
