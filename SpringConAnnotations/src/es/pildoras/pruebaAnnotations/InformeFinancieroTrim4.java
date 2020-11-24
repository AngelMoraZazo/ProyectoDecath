package es.pildoras.pruebaAnnotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim4 implements CrearInformeIFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion informe de cierre de año";
	}

}
