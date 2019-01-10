package video.video.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import video.video.entity.User;
import video.video.mapper.UserMapper;

@Repository("UserDao")
public class UserDao {
	
	@Autowired
	private UserMapper userMapper;
	
	public List<User> GetUserList() throws Exception{
		List<User> userlist = userMapper.GetUserList();
		return userlist;
	}

}
