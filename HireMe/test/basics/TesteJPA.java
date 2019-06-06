package basics;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteJPA {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hireme");
		
		factory.close();
		
	}
	
}
