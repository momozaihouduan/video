package video.video.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import video.video.entity.User;

@Mapper
public interface UserMapper {

	public List<User> GetUserList()throws Exception;
}
