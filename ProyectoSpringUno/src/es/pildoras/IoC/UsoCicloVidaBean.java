package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Cargar el xml de configuracion
		
		ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("aplicationContext3.xml");
		
		//Obtenciond el Bean
		
		Empleados Juan=contexto.getBean("miEmpleado",Empleados.class);
		
		//Cerrar contexto
		
		System.out.println(Juan.getInforme());
		contexto.close();
		
	}

}
