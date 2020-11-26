package it.prova.dao.impl;

import org.springframework.stereotype.Component;

import it.prova.dao.DbMock;
import it.prova.dao.MateriaPrimaDAO;
import it.prova.model.Lavorazione;
import it.prova.model.MateriaPrima;

@Component
public class MateriaPrimaDAOImpl implements MateriaPrimaDAO {

	@Override
	public boolean update(MateriaPrima materiaPrima) {
		boolean esito=false;
		// Trovo la materia prima nella lista di quelle in lavorazione
		for(Lavorazione lavorazioneItem:DbMock.LAVORI_IN_CORSO) {
			if (materiaPrima.getLavorazioneCuiESottoposta().getIdLavorazione()==lavorazioneItem.getIdLavorazione()) {
				if (lavorazioneItem.getLavorazioni().contains(materiaPrima)) { // controllo inutile, se ho fatto le cose bene
					lavorazioneItem.getLavorazioni().remove(materiaPrima); // funziona, perché ho implementato l'equals sulla base dell'id
					lavorazioneItem.getLavorazioni().add(materiaPrima);
					esito=true;
				}
		
			}
		}
		
		return esito;
	}

}
