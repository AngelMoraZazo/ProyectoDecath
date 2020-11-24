package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {
	
	//Creacion de campo tipo creacionInforme (interfaz)
	
	private CreacionInformes informeNuevo;
	
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		// TODO Auto-generated constructor stub
		
		this.informeNuevo=informeNuevo;
	
	
	}
	

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: " + informeNuevo.getInforme(); 
	}

}
