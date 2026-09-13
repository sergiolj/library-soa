package application;


import repository.Config;

import jakarta.xml.ws.Endpoint;
import repository.LibraryDatabase;
import service.implement.CollectionServiceImplement;
import service.implement.LoanServiceImplement;
import service.implement.UserServiceImplement;
import shared.MyLogger;

public class ServicePublisherMain {
	public static void main(String[] args) {
		MyLogger consoleLogger = new MyLogger(ServicePublisherMain.class.getName());
		
		String baseUri = "http://localhost:8085/services/";
		final LibraryDatabase database = new LibraryDatabase();
		Config.CreateData(database);
		
		consoleLogger.info("=== Inicializando Barramento de Serviços da Biblioteca (SOA) ===");
		
		Endpoint user = Endpoint.publish(baseUri + "UserService", new UserServiceImplement(database));
		Endpoint collecion = Endpoint.publish(baseUri + "CollectionService", new CollectionServiceImplement(database));
		Endpoint loan = Endpoint.publish(baseUri + "LoanService", new LoanServiceImplement(database));
		
		if(user.isPublished() && collecion.isPublished() && loan.isPublished()) {
			consoleLogger.info("Servidor carregado com sucesso!");
		}
		consoleLogger.info("Serviços ativos e WSDLs disponíveis em:");
        consoleLogger.info("1. " + baseUri + "UserService?wsdl");
        consoleLogger.info("2. " + baseUri + "CollectionService?wsdl");
        consoleLogger.info("3. " + baseUri + "LoanService?wsdl");
	}

}
