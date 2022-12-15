package com.hibernate.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="eva_cat_evaluacion", schema="sc_evaluacion")
public class evaluacion {
	
	@Id
	@Column(name="cod_evaluacion", unique=true, nullable=false)
	private String cod_evaluacion; 
	@Column(name="desc_evaluacion",nullable=true)
	private String desc_evaluacion;
	
	//Constructores
	
	public evaluacion() {
		super();
	}
	public evaluacion(String cod_evaluacion, String desc_evaluacion) {
		super();
		this.cod_evaluacion = cod_evaluacion;
		this.desc_evaluacion = desc_evaluacion;
	}
	//GETTERS Y SETTERS
	public String getCod_evaluacion() {
		return cod_evaluacion;
	}
	public void setCod_evaluacion(String cod_evaluacion) {
		this.cod_evaluacion = cod_evaluacion;
	}
	public String getDesc_evaluacion() {
		return desc_evaluacion;
	}
	public void setDesc_evaluacion(String desc_evaluacion) {
		this.desc_evaluacion = desc_evaluacion;
	}
	
	
	@Override
	public String toString() {
		return "( " +cod_evaluacion+ " = " +desc_evaluacion+ " )";
	}
	
	

}
