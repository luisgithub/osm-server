package com.erpsom.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "presupuesto")
public class Presupuesto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private int asistente;
	private int doctor;
	@Temporal(TemporalType.DATE)
	private Date fecha;
	@Temporal(TemporalType.DATE)
	private Date fecha_entrega;
	private String garantia_ultra;
	private BigDecimal subtotal;
	private BigDecimal iva;
	private BigDecimal total;
	@ManyToOne
	@JoinColumn(name = "paciente", referencedColumnName = "id")
	private Paciente paciente;
	@JsonManagedReference
	@OneToMany(mappedBy = "presupuesto", fetch = FetchType.LAZY)
	private Set<PresupuestoDetalle> presupuestoDetalleSet = new HashSet<>();

	public Presupuesto() {
	}

	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public int getAsistente() {
		return asistente;
	}
	public void setAsistente(int asistente) {
		this.asistente = asistente;
	}
	public int getDoctor() {
		return doctor;
	}
	public void setDoctor(int doctor) {
		this.doctor = doctor;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getFecha_entrega() {
		return fecha_entrega;
	}
	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}
	public String getGarantia_ultra() {
		return garantia_ultra;
	}
	public void setGarantia_ultra(String garantia_ultra) {
		this.garantia_ultra = garantia_ultra;
	}
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	public BigDecimal getIva() {
		return iva;
	}
	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Set<PresupuestoDetalle> getPresupuestoDetalleSet() {
		return presupuestoDetalleSet;
	}

	public void setPresupuestoDetalleSet(Set<PresupuestoDetalle> presupuestoDetalleSet) {
		this.presupuestoDetalleSet = presupuestoDetalleSet;
	}
}
