package service;

import java.time.LocalDate;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(targetNamespace = "http://service.soa.library.com")
public interface LoanService {
	
	@WebMethod
	boolean registerLoan(@WebParam(name = "userId") Long userId, @WebParam(name="mediaBarcode") String mediaId);

	@WebMethod
	boolean returnLoan(@WebParam(name = "mediaBarcode") String barcode);
	
	@WebMethod
	double calculateOverdueFee(@WebParam(name = "currentDate") LocalDate date);
	
	@WebMethod
	int checkReturnDeadline(@WebParam(name = "mediaBarcode") String barcode);
	
}
