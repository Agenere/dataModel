package kr.or.ksmart.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ksmart.model.vo.UserOrder;

@Mapper
public interface UserOrderMapper {
	//주문 등록
	int insertOrder(UserOrder userOrder);
	
	
	//유저 모든 주문 정보 가져오기
	List<UserOrder> selectOrderList(String userId);
	
	
	//해당 주문의 정보를 가져옴
	UserOrder selectOrderOne(int orderNo);
	
	
	//해당 계좌에 대한 주문 정보 가져오기
	List<UserOrder> selectAccounNoOrderList(String accounNo);
}
