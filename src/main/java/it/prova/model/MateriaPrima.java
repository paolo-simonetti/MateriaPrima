package it.prova.model;

public class MateriaPrima implements Comparable<MateriaPrima> {

	private Long idMateriaPrima;
	private String descrizioneMateriaPrima;
	private Stato statoMateriaPrima;
	private Lavorazione lavorazioneCuiESottoposta;
	
	

	public Long getIdMateriaPrima() {
		return idMateriaPrima;
	}
	
	public void setIdMateriaPrima(Long idMateriaPrima) {
		this.idMateriaPrima = idMateriaPrima;
	}
	
	public String getDescrizioneMateriaPrima() {
		return descrizioneMateriaPrima;
	}
	
	public void setDescrizioneMateriaPrima(String descrizioneMateriaPrima) {
		this.descrizioneMateriaPrima = descrizioneMateriaPrima;
	}
	
	public Stato getStatoMateriaPrima() {
		return statoMateriaPrima;
	}
	
	public void setStatoMateriaPrima(Stato statoMateriaPrima) {
		this.statoMateriaPrima = statoMateriaPrima;
	}

	public Lavorazione getLavorazioneCuiESottoposta() {
		return lavorazioneCuiESottoposta;
	}

	public void setLavorazioneCuiESottoposta(Lavorazione lavorazioneCuiESottoposta) {
		this.lavorazioneCuiESottoposta = lavorazioneCuiESottoposta;
	}

	public MateriaPrima(Long idMateriaPrima, String descrizioneMateriaPrima, Lavorazione lavorazioneCuiESottoposta) {
		super();
		this.idMateriaPrima = idMateriaPrima;
		this.descrizioneMateriaPrima = descrizioneMateriaPrima;
		this.lavorazioneCuiESottoposta = lavorazioneCuiESottoposta;
		this.statoMateriaPrima=Stato.IN_INSERIMENTO;
	}

	@Override
	public String toString() {
		return "MateriaPrima [descrizioneMateriaPrima=" + descrizioneMateriaPrima + ", statoMateriaPrima="
				+ statoMateriaPrima + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MateriaPrima other = (MateriaPrima) obj;
		if (idMateriaPrima == null) {
			if (other.idMateriaPrima != null)
				return false;
		} else if (!idMateriaPrima.equals(other.idMateriaPrima))
			return false;
		return true;
	}

	@Override
	public int compareTo(MateriaPrima materiaPrimaInstance) {
		return this.idMateriaPrima.compareTo(materiaPrimaInstance.getIdMateriaPrima());
	}
	
	
	
}
