package model;

import java.io.Serializable;
import lombok.Data;

@Data
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private UserCategory category;
	private String password;
	private UserStatus status;

}
