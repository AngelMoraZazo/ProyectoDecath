package es.pildoras.pruebaAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//leer el xml de configuracion
		
//		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("aplicationContext.xml");
		
		
		//Leer el class de configuracion
		
		AnnotationConfigApplicationContext contexto=new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		//pedir un bean al contenedor
		
		/*
		 * Empleados Antonio=contexto.getBean("comercialExperimentado",Empleados.class);
		 * 
		 * Empleados Lucia=contexto.getBean("comercialExperimentado",Empleados.class);
		 * 
		 * //¿Aputnan al mismo objeto de memoria?
		 * 
		 * if(Antonio==Lucia) { System.out.println("Apuntan al mismo lugar de memoria");
		 * System.out.println(Antonio + "\n"+ Lucia);
		 * 
		 * }else { System.out.println("NO APUNTAN al mismo lugar de memoria");
		 * System.out.println(Antonio + "\n"+ Lucia);
		 * 
		 * }
		 */
		
		
		DirectorFinanciero Director=contexto.getBean("directorFinanciero",DirectorFinanciero.class);
		System.out.println(Director.getTareas());
		System.out.println(Director.getInforme());
		System.out.println("Email del director: " + Director.getEmail());
		System.out.println("Nombre de la empresa: " +Director.getNombreEmpresa());
		
		
		
		
		
		//cerrar el contexto
		contexto.close();
	}

}
