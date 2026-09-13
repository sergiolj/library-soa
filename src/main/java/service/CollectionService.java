package service;

import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import model.Media;

@WebService(targetNamespace = "http://service.soa.library.com")
public interface CollectionService {
	
	@WebMethod
	boolean registerMedia(@WebParam(name="media") Media media);
	
	@WebMethod
	List<Media> checkMediaAvaiabilityByName(@WebParam(name="mediaName") String mediaName);
	
	@WebMethod
	boolean checkMediaAvaiabilityById(@WebParam(name = "id") String id);
	

}
