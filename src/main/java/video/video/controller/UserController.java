package video.video.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import video.video.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
	
	@Resource(name="UserService")
	private UserService userservice;
	
	@RequestMapping(value="/getuserlist")
	@ResponseBody
	public String GetUserList(){
		String id = userservice.GetUser();
		return "xiaoming" + id;
	}
	
}
