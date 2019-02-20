package kr.or.ksmart.dataModel.mapper;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ksmart.dataModel.vo.User;

@Mapper
public interface ModelMapper {
	//로그인
	User selectUser(User user);
}
