package kr.or.ksmart.model.mapper;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ksmart.model.vo.UserOrder;

@Mapper
public interface OrderMapper {
	//주문
	int insertOrder(UserOrder userOrder);
}
