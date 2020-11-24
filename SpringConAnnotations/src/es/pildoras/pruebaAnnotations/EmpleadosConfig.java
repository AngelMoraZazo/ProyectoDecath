package es.pildoras.pruebaAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.pildoras.pruebaAnnotations")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {

	//definir el bean para InformeFinancieroDtoCompras
	
	@Bean
	public CrearInformeIFinanciero informeFinancieroDtoCompras() {  //esto será el id del bean
		
		return new InformeFinancieroDtoCompras();
		
	}
	
	//Definir el bean para DirectorFinanciero e inyectar dependencias
	
	@Bean
	public Empleados directorFinanciero() {
		
		
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
	
}
