package service.implement;

import java.time.LocalDate;

import jakarta.jws.WebService;
import model.Loan;
import model.Media;
import model.User;
import model.UserStatus;
import repository.LibraryDatabase;
import service.LoanService;

@WebService(endpointInterface = "service.LoanService", 
serviceName = "LoanService",
portName = "LoanServicePort",
targetNamespace = "http://service.soa.library.com/")

public class LoanServiceImplement implements LoanService {
	private LibraryDatabase database;
	
	public LoanServiceImplement() {
		this.database = new LibraryDatabase();
	}
	
	public LoanServiceImplement(LibraryDatabase database) {
		this.database = database;
		
	}

	@Override
	public boolean registerLoan(Long userId, String barcode) {
		User logged = database.getUser(userId);
		Media media = database.getMedia(barcode);
		
		if(logged != null && logged.getStatus() == UserStatus.REGULAR ) {
			if(media != null && media.isAvailable()) {
				database.addLoan(new Loan(logged, media));
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean returnLoan(String barcode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double calculateOverdueFee(LocalDate date) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int checkReturnDeadline(String barcode) {
		// TODO Auto-generated method stub
		return 0;
	}

}
