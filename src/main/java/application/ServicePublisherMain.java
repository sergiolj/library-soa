package application;


import repository.Config;

import jakarta.xml.ws.Endpoint;
import repository.LibraryDatabase;
import service.implement.CollectionServiceImplement;
import service.implement.LoanServiceImplement;
import service.implement.UserServiceImplement;

public class ServicePublisherMain {
	public static void main(String[] args) {
		String baseUri = "http://localhost:8085/services/";
		final LibraryDatabase database = new LibraryDatabase();
		Config.CreateData(database);
		
		
		System.out.println("=== Inicializando Barramento de Serviços da Biblioteca (SOA) ===");
		
		Endpoint user = Endpoint.publish(baseUri + "UserService", new UserServiceImplement(database));
		Endpoint collecion = Endpoint.publish(baseUri + "CollectionService", new CollectionServiceImplement(database));
		Endpoint loan = Endpoint.publish(baseUri + "LoanService", new LoanServiceImplement(database));
		
		if(user.isPublished() && collecion.isPublished() && loan.isPublished()) {
			System.out.println("Servidor carregado com sucesso!");
		}
		System.out.println("Serviços ativos e WSDLs disponíveis em:");
        System.out.println("1. " + baseUri + "UserService?wsdl");
        System.out.println("2. " + baseUri + "CollectionService?wsdl");
        System.out.println("3. " + baseUri + "LoanService?wsdl");
	}

}
