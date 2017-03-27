package com.erpsom.domain;

import javax.persistence.*;

@Entity
@Table(name = "tipo_lente")

public class TipoLente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	String tipo_lente;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipo_lente() {
		return tipo_lente;
	}
	public void setTipo_lente(String tipo_lente) {
		this.tipo_lente = tipo_lente;
	}


}
