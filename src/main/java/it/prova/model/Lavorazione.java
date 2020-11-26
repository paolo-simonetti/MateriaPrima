package it.prova.model;

import java.util.Set;
import java.util.TreeSet;

public class Lavorazione implements Comparable<Lavorazione>{
	private Long idLavorazione;
	private String descrizioneLavorazione;
	private Set<MateriaPrima> lavorazioni=new TreeSet<>();
	
	public Lavorazione(Long idLavorazione,String descrizioneLavorazione) {
		super();
		this.idLavorazione=idLavorazione;
		this.descrizioneLavorazione = descrizioneLavorazione;
	}

	public Set<MateriaPrima> getLavorazioni() {
		return lavorazioni;
	}
	
	public String getDescrizioneLavorazione() {
		return descrizioneLavorazione;
	}

	public void setDescrizioneLavorazione(String descrizioneLavorazione) {
		this.descrizioneLavorazione = descrizioneLavorazione;
	}

	public void setLavorazioni(Set<MateriaPrima> lavorazioni) {
		this.lavorazioni = lavorazioni;
	}

	public Long getIdLavorazione() {
		return idLavorazione;
	}

	public void setIdLavorazione(Long idLavorazione) {
		this.idLavorazione = idLavorazione;
	}

	public void addToLavorazioni(MateriaPrima materiaPrima) {
		this.lavorazioni.add(materiaPrima);
	}

	@Override
	public int compareTo(Lavorazione lavorazioneInstance) {
		return this.idLavorazione.compareTo(lavorazioneInstance.getIdLavorazione());
	}
	
	
}
