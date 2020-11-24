package es.pildoras.spring.mvc.validacionespersonalizadas;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CPostalMadridValidacion implements ConstraintValidator<CpostalMadrid, String> {

	private String prefijoCodigoMadrid;

	@Override
	public void initialize(CpostalMadrid elCodigo) {
		
		prefijoCodigoMadrid=elCodigo.value();
	
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		
		boolean validacionCodigo;
		
		if(arg0!=null) {
			validacionCodigo=arg0.startsWith(prefijoCodigoMadrid);
		}else {
			return validacionCodigo=true;
		}
		
		
		return validacionCodigo;
	}
	

}
