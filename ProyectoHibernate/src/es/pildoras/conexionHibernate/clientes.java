package es.pildoras.conexionHibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="clientes")
public class clientes{
	
	public clientes() {
		
	}
	

	public clientes(String nombre, String apellidos, String direccion) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idclientes")
	private int idclientes;
	
	@Column(name="Nombre")
	private String nombre;
	
	@Column(name="Apellidos")
	private String apellidos;
	
	@Column(name="Direccion")
	private String direccion;

	public int getIdclientes() {
		return idclientes;
	}


	public void setIdclientes(int idclientes) {
		this.idclientes = idclientes;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	@Override
	public String toString() {
		return "Clientes [idclientes=" + idclientes + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion="
				+ direccion + "]";
	}
	
	
	

}
