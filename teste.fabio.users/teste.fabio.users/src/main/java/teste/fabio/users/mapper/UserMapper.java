package teste.fabio.users.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import teste.fabio.users.domain.User;

@Mapper
public interface UserMapper {

	void insertUser(User user);
	
	List<User> findAllUsers();
	
	User findUserById(Integer id);

	void updateUser(User user);
	
	List<User> findUser(User user);

	void deleteUser(Integer userId);
}
