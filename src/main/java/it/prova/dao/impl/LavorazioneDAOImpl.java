package it.prova.dao.impl;

import org.springframework.stereotype.Component;

import it.prova.dao.DbMock;
import it.prova.dao.LavorazioneDAO;
import it.prova.model.Lavorazione;
import it.prova.model.MateriaPrima;

@Component
public class LavorazioneDAOImpl implements LavorazioneDAO {

	@Override
	public Lavorazione get(Long idLavorazione) {
		for (Lavorazione lavorazioneItem:DbMock.LAVORI_IN_CORSO) {
			if (lavorazioneItem.getIdLavorazione()==idLavorazione) {
				return lavorazioneItem;
			}
		}
		return null;
	}

	@Override
	public void addMateriaPrimaToLavorazioni(MateriaPrima materiaPrimaInstance, Lavorazione lavorazioneInstance) {
		materiaPrimaInstance.setLavorazioneCuiESottoposta(lavorazioneInstance);
		for (Lavorazione lavorazioneItem:DbMock.LAVORI_IN_CORSO) {
			if (lavorazioneItem.getIdLavorazione()==lavorazioneInstance.getIdLavorazione()) {
				lavorazioneItem.addToLavorazioni(materiaPrimaInstance);
			}
		}
	}

}
