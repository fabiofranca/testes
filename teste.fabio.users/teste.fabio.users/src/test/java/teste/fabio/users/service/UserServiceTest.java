package teste.fabio.users.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import teste.fabio.users.UserTestConfig;
import teste.fabio.users.domain.User;

@Ignore
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {UserTestConfig.class})
public class UserServiceTest {
	
	@Autowired private UserService userService;
	
	@Test
	public void shouldSaveUserOnDatabase(){
		User user = new User();
		user.setUsername("fabio");
		userService.saveUser(user);
		List<User> users = userService.searchUser(user);
		Assert.assertNotNull(users);
	}

}
