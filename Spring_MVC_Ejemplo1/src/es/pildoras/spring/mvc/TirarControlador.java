package es.pildoras.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TirarControlador {

	
	@RequestMapping("/procesarFormulario3")
	public String otroProcesoFormulario(HttpServletRequest request,Model modelo) {
			
		String nombre=request.getParameter("nombreAlumno");
		nombre+=" es el peor alumno";
		
		String mensajeFinal="Quien es el peor alumno? " + nombre;
		
		//agregando info al modelo
		
		modelo.addAttribute("mensajeClaro",mensajeFinal);
		
		return "HolaAlumnosSpring";
		
	}
}
