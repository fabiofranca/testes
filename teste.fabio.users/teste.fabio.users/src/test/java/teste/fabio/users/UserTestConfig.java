package teste.fabio.users;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import teste.fabio.users.domain.User;

@Configuration
public class UserTestConfig {
	
	@Bean
	public User user(){
		return new User();
	}
}
