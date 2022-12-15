package com.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class evaluacionServicioImpl implements evaluacionServicio {
	
	@PersistenceContext
	private EntityManager em;

	public List<evaluacion> buscarTodos() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT eva FROM evaluacion eva").getResultList();
	}

}
