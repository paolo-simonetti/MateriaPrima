package it.prova.service.serviceImpl;

import org.springframework.stereotype.Service;

import it.prova.model.MateriaPrima;
import it.prova.model.Stato;
import it.prova.service.AssemblaggioService;

@Service
public class AssemblaggioServiceImpl implements AssemblaggioService {

	@Override
	public void portaInAssemblaggio(MateriaPrima materiaPrima) {
		materiaPrima.setStatoMateriaPrima(Stato.IN_ASSEMBLAGGIO);
		System.out.println("Portata in assemblaggio "+materiaPrima);
	}

}
