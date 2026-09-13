package service.implement;

import java.util.Collections;
import java.util.List;

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
		if (media!=null) {
			return database.addMedia(media);
		}
		return false;
	}

	@Override
	public List<Media> checkMediaAvaiabilityByName(String mediaName) {
		if(!mediaName.isBlank()) {
			return database.getMediaByName(mediaName);
		}
		return Collections.emptyList();
	}

	@Override
	public boolean checkMediaAvaiabilityById(String id) {
		return database.getMedia(id).isAvailable();
	}

}
