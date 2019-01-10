package video.video.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import video.video.entity.User;
import video.video.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
	
	@Resource(name="UserService")
	private UserService userservice;
	
	@ResponseBody
	@RequestMapping(value="/getuserlist")
	public List<User> GetUserList() throws Exception{
		List<User> usetlist = userservice.GetUser();
		return usetlist;
	}
	
}
