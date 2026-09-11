package service.implement;

import jakarta.jws.WebService;
import model.Media;
import repository.LibraryDatabase;
import service.CollectionService;

@WebService(endpointInterface = "service.CollectionService", 
serviceName = "CollectionService",
portName = "CollectionServicePort",
targetNamespace = "http://service.soa.library.com/")
public class CollectionServiceImplement implements CollectionService {
	
	private LibraryDatabase database;
	
	public CollectionServiceImplement () {
		this.database = new LibraryDatabase();
	}
	
	public CollectionServiceImplement(LibraryDatabase database) {
		this.database = database;
	}

	@Override
	public boolean registerMedia(Media media) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkMediaAvaiability(Media media) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkMediaAvaiabilityById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
