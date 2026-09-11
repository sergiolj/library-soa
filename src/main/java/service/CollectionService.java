package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import model.Media;

@WebService(targetNamespace = "http://service.soa.library.com")
public interface CollectionService {
	
	@WebMethod
	boolean registerMedia(@WebParam(name="media") Media media);
	
	@WebMethod
	boolean checkMediaAvaiability(@WebParam(name="media") Media media);
	
	@WebMethod
	boolean checkMediaAvaiabilityById(@WebParam(name = "id") String id);
	

}
