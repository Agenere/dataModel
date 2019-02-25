package kr.or.ksmart.model.mapper;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ksmart.model.vo.Account;


@Mapper
public interface AccountMapper {
	int insertAccount(Account account);
}
