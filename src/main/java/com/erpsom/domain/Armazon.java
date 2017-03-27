package com.erpsom.domain;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "armazon")
public class Armazon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private int categoria;
	private int marca;
	private int modelo;
	private String medida;
	private int color;

	@Type(type = "org.hibernate.type.NumericBooleanType")
	private Boolean activo;

	public Armazon() {
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public int getMarca() {
		return marca;
	}
	public void setMarca(int marca) {
		this.marca = marca;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
}
