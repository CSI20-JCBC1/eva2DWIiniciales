package com.hibernate.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.dao.alumno;
import com.hibernate.dao.alumnoServicio;
import com.hibernate.dao.alumnoServicioImpl;
import com.hibernate.dao.evaluacion;
import com.hibernate.dao.evaluacionServicioImpl;

@Component
public class consultas {
	
	@Autowired
	private alumnoServicioImpl asi;
	
	@Autowired
	private evaluacionServicioImpl esi;
	
	//La etiqueta Transactional automatiza la gestión de la transacción.
	@Transactional
	public void insertarUnAlumno(alumno alumno) {
		asi.insertarAlumno(alumno);
	}
	
	@Transactional
	public void insertarListaAlumnos(Collection<alumno> colAlumnos) {
		for (alumno alumno : colAlumnos) {
			asi.insertarAlumno(alumno);
		}
	}
	
	@Transactional
	public List<alumno> buscarTodosAlumnos() {
		return asi.buscarTodos();
	}
	
	@Transactional
	public List<evaluacion> buscarTodasEvaluaciones() {
		return esi.buscarTodos();
	}

}
