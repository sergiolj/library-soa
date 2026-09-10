package service;

import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import model.User;

@WebService(targetNamespace = "http://service.soa.library.com/")
public interface UserService {
	
	@WebMethod
	boolean registerUser(@WebParam(name="user") User user);
	
	@WebMethod
	boolean loginUser(@WebParam(name = "id") String id, @WebParam(name = "password") String password);
	
	@WebMethod
    boolean registerAttendant(@WebParam(name = "attendant") User user);

    @WebMethod
    List<String> checkUserStatus(@WebParam(name = "id") String id);

    @WebMethod
    List<String> retrieveUserLoanHistory(@WebParam(name = "id") String id);

}
