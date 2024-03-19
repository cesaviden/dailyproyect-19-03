package es.cesaviden.pruebasannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Leer el XML de configuración
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Pedir un Bean al contenedor
		
		Empleados Antonio = contexto.getBean("ComercialExperimentado", Empleados.class);
		
		// Usar el Bean
		
		System.out.println(Antonio.getInforme());
		
		System.out.println(Antonio.getTareas());0
		
		// Cerrar el contexto
		
	}

}
