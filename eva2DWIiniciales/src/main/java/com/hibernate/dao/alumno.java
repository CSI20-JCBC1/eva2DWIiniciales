package com.hibernate.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="eva_tch_notas_evaluacion", schema="sc_evaluacion")
public class alumno {

	@Column(name="md_uuid",nullable=false)
	private String md_uuid; 
	//@Column(name="md_fch",nullable=true)
	//private String md_fch; 
	@Id
	@Column(name="id_nota_evaluacion", unique=true, nullable=false)
	private Integer id_nota_evaluacion;
	@Column(name="cod_alumno",nullable=false)
	private String cod_alumno; 
	@Column(name="nota_evaluacion",nullable=false)
	private Integer nota_evaluacion; 
	@Column(name="cod_evaluacion",nullable=false)
	private String cod_evaluacion ;
	
	//Constructores
    public alumno() {
		super();
	}
    
	public alumno(String md_uuid, Integer id_nota_evaluacion, String cod_alumno, Integer nota_evaluacion,
			String cod_evaluacion) {
		super();
		this.md_uuid = md_uuid;
		this.id_nota_evaluacion = id_nota_evaluacion;
		this.cod_alumno = cod_alumno;
		this.nota_evaluacion = nota_evaluacion;
		this.cod_evaluacion = cod_evaluacion;
	}
	
	//GETTERS y SETTERS
	public String getMd_uuid() {
		return md_uuid;
	}
	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}
	
	public Integer getId_nota_evaluacion() {
		return id_nota_evaluacion;
	}
	public void setId_nota_evaluacion(Integer id_nota_evaluacion) {
		this.id_nota_evaluacion = id_nota_evaluacion;
	}
	public String getCod_alumno() {
		return cod_alumno;
	}
	public void setCod_alumno(String cod_alumno) {
		this.cod_alumno = cod_alumno;
	}
	public Integer getNota_evaluacion() {
		return nota_evaluacion;
	}
	public void setNota_evaluacion(Integer nota_evaluacion) {
		this.nota_evaluacion = nota_evaluacion;
	}
	public String getCod_evaluacion() {
		return cod_evaluacion;
	}
	public void setCod_evaluacion(String cod_evaluacion) {
		this.cod_evaluacion = cod_evaluacion;
	}

	@Override
	public String toString() {
		return "Nombre: "+ cod_alumno +" Nota: " + nota_evaluacion + " Eveluacion: " + cod_evaluacion;
	}
	
	

}
