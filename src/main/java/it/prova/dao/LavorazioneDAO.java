package it.prova.dao;

import it.prova.model.Lavorazione;
import it.prova.model.MateriaPrima;

public interface LavorazioneDAO {
	
	public Lavorazione get(Long idLavorazione);
	
	public void addMateriaPrimaToLavorazioni(MateriaPrima materiaPrimaInstance, Lavorazione lavorazioneInstance);
	
}
