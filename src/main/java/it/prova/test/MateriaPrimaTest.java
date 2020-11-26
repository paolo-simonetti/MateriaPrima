package it.prova.test;

import it.prova.model.Lavorazione;
import it.prova.model.MateriaPrima;
import it.prova.service.LavorazioneService;
import it.prova.spring.MyServiceFactory;

public class MateriaPrimaTest {
	public static void main(String[] args) {
		LavorazioneService lavorazioneService=MyServiceFactory.getLavorazioneService();
	
		Lavorazione lavorazione1=lavorazioneService.carica(1L);
	
		// Creo una materia prima 
		MateriaPrima materiaPrima1=new MateriaPrima(4L,"trattore",lavorazione1);
	
		//Aggiungo la materia prima alla lavorazione
		lavorazioneService.aggiungiMateriaPrimaALavorazioni(materiaPrima1,lavorazione1);
	
		lavorazioneService.avviaLavorazione(materiaPrima1);
	
	}
}
