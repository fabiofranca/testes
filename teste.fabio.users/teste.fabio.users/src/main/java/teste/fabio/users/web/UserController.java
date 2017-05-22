package teste.fabio.users.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import teste.fabio.users.domain.User;
import teste.fabio.users.service.UserService;

@Controller
public class UserController {
	
	private final String USER_PAGE = "user";
	private final String USER_LIST_PAGE = "userList";
	private final String USER_LIST_CONTEXT = "/user/listAll";
	
	@Autowired private UserService userService;
	
	@RequestMapping(USER_LIST_CONTEXT)
	public String listAll(Model model){
		List<User> usersList = userService.showAllUsers();
		model.addAttribute("usersList", usersList);
		model.addAttribute("user", new User());
		return USER_LIST_PAGE;
	}
	
	@RequestMapping("/user/edit")
	public String edit(@RequestParam(name="id")Integer userId, Model model){
		model.addAttribute(USER_PAGE, userService.loadUserById(userId));
		return USER_PAGE;
	}
	
	@RequestMapping("/user/save")
	public String save(User user, BindingResult bindingResult, Model model){
		userService.saveUser(user);
		return redirect(USER_LIST_CONTEXT);
	}
	
	@RequestMapping("/user/delete")
	public String delete(@RequestParam(name="id")Integer userId, Model model){
		userService.deleteUser(userId);
		return redirect(USER_LIST_CONTEXT);
	}
	
	@RequestMapping("user/new")
	public String newUser(Model model){
		model.addAttribute("user", new User());
		return USER_PAGE;
	}
	
	@RequestMapping("user/search")
	public String searchUser(User user, Model model){
		model.addAttribute("usersList", userService.searchUser(user));
		return USER_LIST_PAGE;
	}
	
	private String redirect(String targetContext){
		return "redirect:" + targetContext;
	}
}
