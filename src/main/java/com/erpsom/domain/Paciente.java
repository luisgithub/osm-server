package com.erpsom.domain;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "paciente")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String email, nombres, apellidoPaterno, sexo, telefono, celular, apellidoMaterno, nombreCompleto, homoclave;
	@Temporal(TemporalType.DATE)
	private Date nacimiento;
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean active;
	public Paciente(){
		
	}
	
	public Paciente(String email, String nombres, String apellido_paterno, String sexo, String telefono, String celular,
					Date nacimiento, boolean active) {
		super();
		this.email = email;
		this.nombres = nombres;
		this.apellidoPaterno = apellido_paterno;
		this.sexo = sexo;
		this.telefono = telefono;
		this.celular = celular;
		this.nacimiento = nacimiento;
		this.active = active;
	}

	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public Date getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getHomoclave() {
		return homoclave;
	}

	public void setHomoclave(String homoclave) {
		this.homoclave = homoclave;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
}
