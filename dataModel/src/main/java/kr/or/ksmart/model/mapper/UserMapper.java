package kr.or.ksmart.model.mapper;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ksmart.model.vo.User;

@Mapper
public interface UserMapper {
	//로그인 or 한명의 정보 가져오기
	User selectUser(String userId);

}
