package service.implement;

import java.util.List;

import jakarta.jws.WebService;
import model.User;
import repository.LibraryDatabase;
import service.UserService;

@WebService(endpointInterface = "service.UserService",
serviceName = "UserService",
portName = "UserServicePort",
targetNamespace = "http://service.soa.library.com/")

public class UserServiceImplement implements UserService{
	
	private final LibraryDatabase database;
	
	// Required by JAX-WS specification
	public UserServiceImplement() {
		this.database = new LibraryDatabase();
	}
	
	public UserServiceImplement(LibraryDatabase database) {
		this.database = database;
	}

	@Override
	public boolean registerUser(User user) {
		if(user != null) {
			database.addUser(user);
			return true;
		}
		return false;
	}

	@Override
	public boolean loginUser(String name, String password) {
		if(!name.isBlank() && !password.isBlank()) {
			User user = database.getUserByName(name);
			if(user != null) {
				return user.getPassword().equals(password);
			}
		}
		return false;
	}

	@Override
	public boolean registerAttendant(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String checkUserStatus(String id) {
		if(!id.isBlank()) {
			try{
				User user = database.getUser(Long.parseLong(id));
				return user.getStatus().toString();
			}catch (Exception e) {
				return "Id do usuário incorreto";
			}
		}
		return "Ocorreu um erro ao processar solicitação";
	}

	@Override
	public List<String> retrieveUserLoanHistory(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
