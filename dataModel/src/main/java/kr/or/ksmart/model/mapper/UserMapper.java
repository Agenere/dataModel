package kr.or.ksmart.model.mapper;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ksmart.model.vo.User;

@Mapper
public interface UserMapper {
	//로그인
	User selectUser(String userId);
}
