package es.pildoras.pruebaAnnotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class ComercialExperimentado implements Empleados,InitializingBean,DisposableBean {

	private CrearInformeIFinanciero nuevoInforme;
	
	/*@Autowired
	public ComercialExperimentado(CrearInformeIFinanciero nuevoInforme) {
		super();
		this.nuevoInforme = nuevoInforme;
	}*/

	@Autowired
	@Qualifier("informeFinancieroTrim4") 
	public void setNuevoInforme(CrearInformeIFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender mas";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		//return "Informe generado por el comercial";
		
		return nuevoInforme.getInformeFinanciero();
	}
	
	//EJECUCION DE CODIGO DESPUES DE CREACION DEL BEAN
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Ejecutado tras creacion de bean");
	}
	

	
	//EJECUCION DE CODIGO DESPUES DE APAGARDO DE BEAN


	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Ejecutado antes de la destruccion");
		
	}

}
