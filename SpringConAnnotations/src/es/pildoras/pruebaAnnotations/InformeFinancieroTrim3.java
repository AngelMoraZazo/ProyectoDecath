package es.pildoras.pruebaAnnotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim3 implements CrearInformeIFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion Informe trimestre 3";
	}

}
