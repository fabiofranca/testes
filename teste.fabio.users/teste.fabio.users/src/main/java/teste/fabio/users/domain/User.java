package teste.fabio.users.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4406965888465959690L;
	
	private Integer id;
	private String username;
    private String password;
    private Boolean isEnabled;
    private LocalDateTime registerDate;
    private String name;
    private String surname;
    private String email;
    private String phone;
}
