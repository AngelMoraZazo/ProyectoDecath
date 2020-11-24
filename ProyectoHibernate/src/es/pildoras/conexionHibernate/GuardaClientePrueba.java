package es.pildoras.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class GuardaClientePrueba {

	public static void main(String[] args) {
		
		

		 SessionFactory miFactory = new Configuration()
                 .configure("hibernate.cfg.xml")
                 .addAnnotatedClass(clientes.class)
                 .buildSessionFactory();
		 

		try {

			Session miSession = miFactory.openSession();
			clientes cliente1 = new clientes("Alejandro", "Martin", "Calle P.Vergara");
			
			miSession.beginTransaction();
			
			miSession.save(cliente1);
			
			miSession.getTransaction().commit();
			
			System.out.println("Registro insertado correctamente en la BBDD");
			
			miSession.beginTransaction();
			
			System.out.println("Lectura con registro id " + cliente1.getIdclientes());
			clientes clientesInsertado=miSession.get(clientes.class, cliente1.getIdclientes());
			System.out.println("Resgitrado: " + clientesInsertado);
			miSession.getTransaction().commit();
			System.out.println("Terminado");
			miSession.close();
			
		} finally {
			// TODO: handle finally clause
			
			miFactory.close();
			
		}
	}
	
	


}
