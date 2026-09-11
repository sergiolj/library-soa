package repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import model.Media;
import model.User;
import model.Loan;

public class LibraryDatabase {
	//ConcurrentHashMap foi projetada como thread-safety com alta concorrência sem a necessidade de travar o objeto inteiro (como o synchronized faria)
	private Map<Long, User> users = new ConcurrentHashMap<>();
	private Map<String, Media> collectionMap = new ConcurrentHashMap<>();
	private Map<Long, Loan> loans = new ConcurrentHashMap<>();
	
	private Long idUser = 0L;
	
	public void addUser(User user) {
		idUser++;
		users.put(idUser, user);
	}
	
	public void addMedia(Media media) {
		collectionMap.put(media.getBarcode(), media);
	}
	
	public void addLoan(Loan loan) {
		loans.put(loan.getUser().getId(), loan);
	}
	

	public User getUserByName(String name) {
		if(name != null) {
			return users.values().stream()
					.filter(user-> user.getName().equalsIgnoreCase(name))
							.findFirst()
							.orElse(null);
		}
		return null;
	}
	
	public User getUser(Long id) {
		return users.get(id);
	}

	public Media getMedia(String barcode) {
		if(barcode != null) {
			return collectionMap.get(barcode);
		}
		return null;
	}
}
