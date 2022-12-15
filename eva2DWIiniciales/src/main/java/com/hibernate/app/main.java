package com.hibernate.app;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.dao.alumno;
import com.hibernate.impl.consultas;

public class main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		consultas consulta = (consultas) context.getBean(consultas.class);
		consulta.insertarUnAlumno(new alumno("APIL45aJo",7, "Sergio", 9, "PR"));
		System.out.println("Lista usuarios: " + consulta.buscarTodosAlumnos());
		System.out.println("Lista evaluaciones: " + consulta.buscarTodasEvaluaciones());
		
		//Al no obtener queries que funcionen estaba intentando recorrer 
		//la lista para obtener el valor de cod_evaluacion y hacer lo mismo con 
		//una lista de evaluaciones pero no me da tiempo
		
		

	/*	List<alumno> listaAlumnos= consulta.buscarTodosAlumnos();
		System.out.println("Inserte el alumno que del que quiere la información: ");
		Scanner scan = new Scanner(System.in);
		String nombre= scan.next();
		Integer nota=null;
		String evaluacion=null;
		
		for (alumno a : listaAlumnos) {
			if (nombre==a.getCod_alumno()) {
				nombre=a.getCod_alumno();
				nota=a.getNota_evaluacion();
				evaluacion=a.getCod_evaluacion();
				
			}
		}
		
		*/
		
		
		
	}

}
