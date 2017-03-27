package com.erpsom.domain;

import javax.persistence.*;

@Entity
@Table(name = "Rx")
public class Rx {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private int Color, Lente, TipoLente;
	@JoinColumn(name = "paciente", referencedColumnName = "id")
	@ManyToOne
	private Paciente paciente;
	private String AddOd, AddOi, CilOd, CilOi, DLod, DLoi, DCod, DCoi, AlturaOd, AlturaOi, EjeOd, EjeOi, EsfOd, EsfOi, prisma;

	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getAddOd() {
		return AddOd;
	}
	public void setAddOd(String addOd) {
		AddOd = addOd;
	}
	public String getAddOi() {
		return AddOi;
	}
	public void setAddOi(String addOi) {
		AddOi = addOi;
	}
	public String getCilOd() {
		return CilOd;
	}
	public void setCilOd(String cilOd) {
		CilOd = cilOd;
	}
	public String getCilOi() {
		return CilOi;
	}
	public void setCilOi(String cilOi) {
		CilOi = cilOi;
	}
	public String getAlturaOd() {
		return AlturaOd;
	}
	public void setAlturaOd(String alturaOd) {
		AlturaOd = alturaOd;
	}
	public String getAlturaOi() {
		return AlturaOi;
	}
	public void setAlturaOi(String alturaOi) {
		AlturaOi = alturaOi;
	}
	public String getEjeOd() {
		return EjeOd;
	}
	public void setEjeOd(String ejeOd) {
		EjeOd = ejeOd;
	}
	public String getEjeOi() {
		return EjeOi;
	}
	public void setEjeOi(String ejeOi) {
		EjeOi = ejeOi;
	}
	public String getEsfOd() {
		return EsfOd;
	}
	public void setEsfOd(String esfOd) {
		EsfOd = esfOd;
	}
	public String getEsfOi() {
		return EsfOi;
	}
	public void setEsfOi(String esfOi) {
		EsfOi = esfOi;
	}
	public int getColor() {
		return Color;
	}
	public void setColor(int color) {
		Color = color;
	}
	public int getLente() {
		return Lente;
	}
	public void setLente(int lente) {
		Lente = lente;
	}
	public int getTipoLente() {
		return TipoLente;
	}
	public void setTipoLente(int tipoLente) {
		TipoLente = tipoLente;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public String getPrisma() {
		return prisma;
	}
	public void setPrisma(String prisma) {
		this.prisma = prisma;
	}
	public String getDLoi() {
		return DLoi;
	}
	public void setDLoi(String dLoi) {
		DLoi = dLoi;
	}
	public String getDLod() {
		return DLod;
	}
	public void setDLod(String dLod) {
		DLod = dLod;
	}
	public String getDCod() {
		return DCod;
	}
	public void setDCod(String dCod) {
		DCod = dCod;
	}
	public String getDCoi() {
		return DCoi;
	}
	public void setDCoi(String dCoi) {
		DCoi = dCoi;
	}

}
