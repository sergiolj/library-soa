package repository;


import model.Media;
import model.MediaType;
import model.User;
import model.UserCategory;
import model.UserStatus;

public class Config {
	
	private Config() {}
	
	public static void CreateData(LibraryDatabase database) {
		database.addUser(new User(null, "sergio", UserCategory.STUDENT, "1234", UserStatus.REGULAR));
		database.addUser(new User (null, "Atendente1", UserCategory.ATTENDANT, "123", UserStatus.REGULAR));
		
		database.addMedia(new Media("0001", "Clean Architecture", MediaType.BOOK, true));
		database.addMedia(new Media("2001", "Design Patterns", MediaType.BOOK, false));
	}

}
