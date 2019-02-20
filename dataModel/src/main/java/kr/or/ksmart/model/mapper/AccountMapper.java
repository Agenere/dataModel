package kr.or.ksmart.model.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AccountMapper {
	int insertAccount(Map<String,Object> map);
}
