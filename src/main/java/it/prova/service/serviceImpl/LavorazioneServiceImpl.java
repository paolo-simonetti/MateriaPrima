package it.prova.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.dao.LavorazioneDAO;
import it.prova.dao.MateriaPrimaDAO;
import it.prova.model.Lavorazione;
import it.prova.model.MateriaPrima;
import it.prova.model.Stato;
import it.prova.service.AssemblaggioService;
import it.prova.service.LavorazioneService;
import it.prova.service.MessaInOperaService;
import it.prova.service.VerniciaturaService;

@Service
public class LavorazioneServiceImpl implements LavorazioneService {
	
	@Autowired
	private AssemblaggioService assemblaggioService;
	@Autowired
	private MessaInOperaService messaInOperaService;
	@Autowired
	private VerniciaturaService verniciaturaService; 
	@Autowired
	private MateriaPrimaDAO materiaPrimaDAO;
	@Autowired
	private LavorazioneDAO lavorazioneDAO;
	
	@Override
	public void avviaLavorazione(MateriaPrima materiaPrimaInstance) {
		
		System.out.println("Inizio della lavorazione di "+materiaPrimaInstance);
		materiaPrimaInstance.setStatoMateriaPrima(Stato.IN_LAVORAZIONE);
		assemblaggioService.portaInAssemblaggio(materiaPrimaInstance);
		verniciaturaService.portaInVerniciatura(materiaPrimaInstance);
		messaInOperaService.portaInMessaInOpera(materiaPrimaInstance);
		materiaPrimaInstance.setStatoMateriaPrima(Stato.IN_READY);
		System.out.println("Lavorazione terminata per " + materiaPrimaInstance);
		materiaPrimaDAO.update(materiaPrimaInstance);
		
	}
	
	public Lavorazione carica(Long idLavorazione) {
		return lavorazioneDAO.get(idLavorazione);
	}
	
	public void aggiungiMateriaPrimaALavorazioni(MateriaPrima materiaPrimaInstance, Lavorazione lavorazioneInstance) {
		lavorazioneDAO.addMateriaPrimaToLavorazioni(materiaPrimaInstance,lavorazioneInstance);
	}

	public void setLavorazioneDAO(LavorazioneDAO lavorazioneDAO) {
		this.lavorazioneDAO = lavorazioneDAO;
	}

	public AssemblaggioService getAssemblaggioService() {
		return assemblaggioService;
	}

	public void setAssemblaggioService(AssemblaggioService assemblaggioService) {
		this.assemblaggioService = assemblaggioService;
	}

	public MessaInOperaService getMessaInOperaService() {
		return messaInOperaService;
	}

	public void setMessaInOperaService(MessaInOperaService messaInOperaService) {
		this.messaInOperaService = messaInOperaService;
	}

	public VerniciaturaService getVerniciaturaService() {
		return verniciaturaService;
	}

	public void setVerniciaturaService(VerniciaturaService verniciaturaService) {
		this.verniciaturaService = verniciaturaService;
	}

	public void setMateriaPrimaDAO(MateriaPrimaDAO materiaPrimaDAO) {
		this.materiaPrimaDAO = materiaPrimaDAO;
	}

}
