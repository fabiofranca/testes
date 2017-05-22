package teste.fabio.users.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import teste.fabio.users.domain.User;
import teste.fabio.users.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired private UserMapper userMapper;
	
	public List<User> showAllUsers(){
		return userMapper.findAllUsers();
	}
	
	public User loadUserById(Integer id){
		return userMapper.findUserById(id);
	}
	
	public void saveUser(User user){
		if(isNewUser(user))	userMapper.insertUser(user);

		userMapper.updateUser(user);
	}

	private boolean isNewUser(User user) {
		return user.getId() == null;
	}

	public void deleteUser(Integer userId) {
		userMapper.deleteUser(userId);
	}

	public List<User> searchUser(User user) {
		return userMapper.findUser(user);
	}
	
}
