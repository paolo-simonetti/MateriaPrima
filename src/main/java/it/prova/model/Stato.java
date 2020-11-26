package it.prova.model;

import java.util.Map;
import java.util.TreeMap;

public enum Stato {
	IN_INSERIMENTO("inInserimento"),
	IN_LAVORAZIONE("inLavorazione"),
	IN_ASSEMBLAGGIO("inAssemblaggio"),
	IN_VERNICIATURA("inVerniciatura"),
	IN_MESSA_IN_OPERA("inMessaInOpera"),
	IN_READY("inReady");
	
	private String stringaStato;
	
	Stato(String stringaStato) {
		this.stringaStato=stringaStato;
	}

	public String getStringaStato() {
		return stringaStato;
	}

	public void setStringaStato(String stringaStato) {
		this.stringaStato = stringaStato;
	}
	
	public static Map<String,Stato> conversioneStato= new TreeMap<>();
	static {
		conversioneStato.put("inInserimento",IN_INSERIMENTO);
		conversioneStato.put("inLavorazione",IN_LAVORAZIONE);
		conversioneStato.put("inAssemblaggio",IN_ASSEMBLAGGIO);
		conversioneStato.put("inVerniciatura",IN_VERNICIATURA);
		conversioneStato.put("inMessaInOpera",IN_MESSA_IN_OPERA);
		conversioneStato.put("inReady",IN_READY);
		
	}
	
}
