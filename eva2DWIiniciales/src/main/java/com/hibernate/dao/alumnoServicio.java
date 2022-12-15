package com.hibernate.dao;

import java.util.List;

public interface alumnoServicio {
	
	public void insertarAlumno(alumno alumno);
	
	
	public List<alumno> buscarTodos();

}
