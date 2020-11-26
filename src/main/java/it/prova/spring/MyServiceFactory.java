package it.prova.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.prova.service.LavorazioneService;

public class MyServiceFactory {

	private static ApplicationContext ctx;

	static {
		try {
			ctx  = new AnnotationConfigApplicationContext(AppConfig.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static LavorazioneService getLavorazioneService() {
		return  ctx.getBean(LavorazioneService.class);
	}
}
