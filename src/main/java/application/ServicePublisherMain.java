package application;


import jakarta.xml.ws.Endpoint;
import service.implement.CollectionServiceImplement;
import service.implement.LoanServiceImplement;
import service.implement.UserServiceImplement;

public class ServicePublisherMain {
	public static void main(String[] args) {
		String baseUri = "http:///localhost:8085/services/";
		
		
		System.out.println("=== Inicializando Barramento de Serviços da Biblioteca (SOA) ===");
		
		Endpoint.publish(baseUri + "UserService", new UserServiceImplement());
		Endpoint.publish(baseUri + "CollectionService", new CollectionServiceImplement());
		Endpoint.publish(baseUri + "LoanService", new LoanServiceImplement());
		
		System.out.println("Serviços ativos e WSDLs disponíveis em:");
        System.out.println("1. " + baseUri + "UsuarioService?wsdl");
        System.out.println("2. " + baseUri + "AcervoService?wsdl");
        System.out.println("3. " + baseUri + "EmprestimoService?wsdl");
	}

}
