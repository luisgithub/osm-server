package com.erpsom.domain;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lente")
public class Lente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String codigo, descripcion;
	@Temporal(TemporalType.DATE)
	private Date fecha_registro;
	private int tipo_lente;
	private String material;
	private String medida;
	private String acabado;
	private String esfera;
	private String cilindro;
	private String adicion;
	private String base;
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean activo;

	public Lente() {
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getTipo_lente() {
		return tipo_lente;
	}
	public void setTipo_lente(int tipo_lente) {
		this.tipo_lente = tipo_lente;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public String getAcabado() {
		return acabado;
	}

	public void setAcabado(String acabado) {
		this.acabado = acabado;
	}

	public String getEsfera() {
		return esfera;
	}

	public void setEsfera(String esfera) {
		this.esfera = esfera;
	}

	public String getCilindro() {
		return cilindro;
	}

	public void setCilindro(String cilindro) {
		this.cilindro = cilindro;
	}

	public String getAdicion() {
		return adicion;
	}

	public void setAdicion(String adicion) {
		this.adicion = adicion;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}
}
