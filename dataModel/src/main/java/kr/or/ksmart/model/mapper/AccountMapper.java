package kr.or.ksmart.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ksmart.model.vo.Account;


@Mapper
public interface AccountMapper {
	// 계좌 개설
	int insertAccount(Account account);
	//한개의 계좌 보기 
	List<Account> selectAccount(String userId);
}
