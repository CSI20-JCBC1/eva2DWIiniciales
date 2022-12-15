package com.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class alumnoServicioImpl implements alumnoServicio{

	
	@PersistenceContext
	private EntityManager em;
	
	public void insertarAlumno(alumno alumno) {
		em.persist(alumno);
		
	}

	public List<alumno> buscarTodos() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT alm FROM alumno alm").getResultList();
	}

}
