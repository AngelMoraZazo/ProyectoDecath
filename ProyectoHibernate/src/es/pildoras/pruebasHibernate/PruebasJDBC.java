package es.pildoras.pruebasHibernate;

import java.sql.Connection;
import java.sql.DriverManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class PruebasJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
//			
//			String jdbcUrl="jdbc:mysql://localhost:3306/pruebashibernate?serverTimezone=UTC";
//			
//			System.out.println(jdbcUrl);
//			
//			String user="root";
//			
//			String contra="root";
//			
//			System.out.println("Intentando conectar a la base de datos " + jdbcUrl);
//			
//			Connection miConexion= DriverManager.getConnection(jdbcUrl,user,contra);
			
			SessionFactory miFactory = new Configuration().configure().buildSessionFactory();
			Session miSession = miFactory.openSession();
			
			System.out.println("Conexion realizada");
			miSession.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
