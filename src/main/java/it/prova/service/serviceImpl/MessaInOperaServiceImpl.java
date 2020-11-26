package it.prova.service.serviceImpl;

import org.springframework.stereotype.Service;

import it.prova.model.MateriaPrima;
import it.prova.model.Stato;
import it.prova.service.MessaInOperaService;

@Service
public class MessaInOperaServiceImpl implements MessaInOperaService {

	@Override
	public void portaInMessaInOpera(MateriaPrima materiaPrima) {
		materiaPrima.setStatoMateriaPrima(Stato.IN_MESSA_IN_OPERA);
		System.out.println("Portata in messa in opera "+materiaPrima);

	}

}
