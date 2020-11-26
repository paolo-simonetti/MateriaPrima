package it.prova.service;

import it.prova.model.Lavorazione;
import it.prova.model.MateriaPrima;

public interface LavorazioneService {
	public void avviaLavorazione(MateriaPrima materiaPrimaInstance);
	public Lavorazione carica(Long idLavorazione);
	public void aggiungiMateriaPrimaALavorazioni(MateriaPrima materiaPrimaInstance, Lavorazione lavorazioneInstance);
}
