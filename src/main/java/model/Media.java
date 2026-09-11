package model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Media implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String barcode;
	private String tittle;
	private MediaType type;
	private boolean available;
	

}
