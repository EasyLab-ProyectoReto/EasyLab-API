package com.api.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="formulario", catalog="juanyasa_proyectoreto", schema = "")
public class Formulario {
	
	@Id
	@Column
	private Integer Id_Formulario;
	@Column
	private String Nombre_Pregunta;
	@Column
	private Boolean Respuesta;
	
	public Integer getId_Formulario() {
		return Id_Formulario;
	}
	public void setId_Formulario(Integer id_Formulario) {
		Id_Formulario = id_Formulario;
	}
	public String getNombre_Pregunta() {
		return Nombre_Pregunta;
	}
	public void setNombre_Pregunta(String nombre_Pregunta) {
		Nombre_Pregunta = nombre_Pregunta;
	}
	public Boolean getRespuesta() {
		return Respuesta;
	}
	public void setRespuesta(Boolean respuesta) {
		Respuesta = respuesta;
	}
	
	
}