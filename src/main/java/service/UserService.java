package service;

import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import model.User;

@WebService(targetNamespace = "http://service.soa.library.com/")
public interface UserService {
	
	@WebMethod
	boolean registerUser(@WebParam(name="user") User user);
	
	@WebMethod(operationName = "loginUser")
	@WebResult(name ="authenticated")
	boolean loginUser(@WebParam(name = "name") String name, @WebParam(name = "password") String password);
	
	@WebMethod
    boolean registerAttendant(@WebParam(name = "attendant") User user);

    @WebMethod
    String checkUserStatus(@WebParam(name = "id") String id);

    @WebMethod
    List<String> retrieveUserLoanHistory(@WebParam(name = "id") String id);
    
    @WebMethod
    List<User> listAllUsers();

}
