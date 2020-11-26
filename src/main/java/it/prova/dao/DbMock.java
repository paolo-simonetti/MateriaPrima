package it.prova.dao;

import java.util.Set;
import java.util.TreeSet;

import it.prova.model.Lavorazione;
import it.prova.model.MateriaPrima;

public class DbMock {
	
	public static final Set<Lavorazione> LAVORI_IN_CORSO=new TreeSet<>();
	
	static {
		
		Lavorazione lavorazione1=new Lavorazione(1L,"Produzione di macchina agricole");
		MateriaPrima materiaPrima1=new MateriaPrima(1L,"tosaerba", lavorazione1);
		lavorazione1.addToLavorazioni(materiaPrima1);
		
		Lavorazione lavorazione2=new Lavorazione(2L,"Produzione di automobili");
		MateriaPrima materiaPrima2=new MateriaPrima(2L,"Opel Corsa", lavorazione2);
		lavorazione2.addToLavorazioni(materiaPrima2);

		Lavorazione lavorazione3=new Lavorazione(3L,"Produzione di cancelli d'ingresso");
		MateriaPrima materiaPrima3=new MateriaPrima(3L,"Cancello di metallo intrecciato", lavorazione3);
		lavorazione3.addToLavorazioni(materiaPrima3);

		LAVORI_IN_CORSO.add(lavorazione1);
		LAVORI_IN_CORSO.add(lavorazione2);
		LAVORI_IN_CORSO.add(lavorazione3);

	
	}
	
}
