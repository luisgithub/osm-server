package com.erpsom.domain;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name ="cliente")
public class Cliente {

	@Id
	@GeneratedValue
	private long id;
    private String nombres;
	private String apellidoPaterno;
	private String email;
	private String apellidoMaterno;
	private String telefono;
	private String celular;
	private String rfc;
	@Temporal(TemporalType.DATE)
    private Date creado;
	private String nombreCompleto;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
	private Collection<Domicilio> domicilios;

    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreado() {
		return creado;
	}

	public void setCreado(Date creado) {
		this.creado = creado;
	}
	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public Collection<Domicilio> getDomicilios() {
		return domicilios;
	}

	public void setDomicilios(Collection<Domicilio> domicilios) {
		this.domicilios = domicilios;
	}
}
