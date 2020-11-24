package es.pildoras.spring.mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import es.pildoras.spring.mvc.validacionespersonalizadas.CpostalMadrid;

public class Alumno {
	
	@NotNull
	@Size(min=2,message="* Campo requerido")
	private String nombre;
	
	private String apellido;
	
	private String asignaturaOptativa;
	
	private String ciudadEstudios;
	
	private String deportes;
	
	@Max(value = 65,message = "* La edad supera los 65 años")
	@Min(value = 10,message = "* La edad es menor de 10 años")
	private int edad;
	
	
	@Email(message = "* Debe ser una dirección de correo electrónico con formato correcto")
	private String email;
	
	//@Pattern(regexp = "[0-9]{5}",message = "* Sólo 5 valores numéricos")  //regerxp es una expresion regular el cual en este caso deja meter numeros del 0 al 9 y 5 digitos
	//Ahora vamos a usar nuestra propia anotacion de validacion
	@CpostalMadrid
	private String codigoPostal;
	
	
	
	
	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getAsignaturaOptativa() {
		return asignaturaOptativa;
	}

	public void setAsignaturaOptativa(String asignaturaOptativa) {
		this.asignaturaOptativa = asignaturaOptativa;
	}

	public String getCiudadEstudios() {
		return ciudadEstudios;
	}

	public void setCiudadEstudios(String ciudadEstudios) {
		this.ciudadEstudios = ciudadEstudios;
	}

	public String getDeportes() {
		return deportes;
	}

	public void setDeportes(String deportes) {
		this.deportes = deportes;
	}


	
}
