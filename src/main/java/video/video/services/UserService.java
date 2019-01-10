package video.video.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import video.video.dao.UserDao;
import video.video.entity.User;

@Service("UserService")
public class UserService {
	
	@Resource(name="UserDao")
	private UserDao userDao;
	
	public List<User> GetUser() throws Exception{
		return userDao.GetUserList();
	}
}
