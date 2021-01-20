package com.api.modelos;

import java.sql.Blob;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="practicas", catalog="juanyasa_proyectoreto", schema = "")
public class Practicas {
	
	@Id
	@Column
	private Integer Id_Practica;
	@Column
	private Date Fecha;
	@Column
	private String Nombre_Practica;
	
	@Column
	private byte[]  Practica_PDF;
	
	@Column
	private String Descripcion;
	
	@Column
	private String Nombre_Herramienta;

	public Integer getId_Practica() {
		return Id_Practica;
	}

	public void setId_Practica(Integer id_Practica) {
		Id_Practica = id_Practica;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public String getNombre_Practica() {
		return Nombre_Practica;
	}

	public void setNombre_Practica(String nombre_Practica) {
		Nombre_Practica = nombre_Practica;
	}

	public byte[] getPractica_PDF() {
		return Practica_PDF;
	}

	public void setPractica_PDF(byte[] practica_PDF) {
		Practica_PDF = practica_PDF;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getNombre_Herramienta() {
		return Nombre_Herramienta;
	}

	public void setNombre_Herramienta(String nombre_Herramienta) {
		Nombre_Herramienta = nombre_Herramienta;
	}
	
	

	
	
	
	


	
}