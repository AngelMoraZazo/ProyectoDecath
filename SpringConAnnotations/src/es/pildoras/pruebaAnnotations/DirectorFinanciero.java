package es.pildoras.pruebaAnnotations;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {

	private CrearInformeIFinanciero informeFinanciero;
	
	@Value("${email}")
	private String email;
	
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
	

	public String getEmail() {
		return email;
	}


	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	public DirectorFinanciero(CrearInformeIFinanciero informeFinanciero) {
		super();
		this.informeFinanciero = informeFinanciero;
	}

	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestion y direccion financiero de una empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}
	


}
