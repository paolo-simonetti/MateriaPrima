package it.prova.service.serviceImpl;

import org.springframework.stereotype.Service;

import it.prova.model.MateriaPrima;
import it.prova.model.Stato;
import it.prova.service.VerniciaturaService;

@Service
public class VerniciaturaServiceImpl implements VerniciaturaService {

	@Override
	public void portaInVerniciatura(MateriaPrima materiaPrima) {
		materiaPrima.setStatoMateriaPrima(Stato.IN_VERNICIATURA);
		System.out.println("Portata in verniciatura "+materiaPrima);
	}

}
