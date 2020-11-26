package it.prova.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"it.prova.dao","it.prova.service"})
public class AppConfig {
	
	/*
	@Bean
	public MessageService getMessageService(){
		return new MessageServiceImpl();
	}
	*/
	
}
