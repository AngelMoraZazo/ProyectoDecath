package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//carga de XML configuration
		
		ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("aplicationContext2.xml");
		
		//peticion de beans al contenedor Spring
		
		SecretarioEmpleado Maria=contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		SecretarioEmpleado Pedro=contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		System.out.println(Maria);
		System.out.println(Pedro);

	}

}
