package es.pildoras.IoC;

public class SecretarioEmpleado implements Empleados {

	private CreacionInformes informeNuevo;	
	private String email;
	private String nombreEmpresa;

	
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "informe generado por el secretario: " + informeNuevo.getInforme();
	}
	
		
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	//metodo init. Ejecutar Tareas antes de que el bean este disponible
	
	public void metodoInicial() {
		System.out.println("dentro del metodo Init. Aqui irian las tareas a ejecutar antes de que el bean este listo");
		
	}
	
	
	//metodo destroy. Ejecutar Tareas despues de que el bean haya sido utilizado
	
	public void metodoFinal() {
		System.out.println("dentro del metodo Destroye. Aqui irian las tareas a ejecutar despues de utilizar el bean");
		
	}
	
	
	

}
