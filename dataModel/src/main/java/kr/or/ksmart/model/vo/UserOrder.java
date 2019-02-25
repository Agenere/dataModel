package kr.or.ksmart.model.vo;

public class UserOrder {
	private String orderDate;
	private int orderNo;
	private String accountNo;
	private String userId;
	private String eventCode;
	private String orderCount;
	private String orderMoney;
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getuserId() {
		return userId;
	}
	public void setuserId(String userId) {
		this.userId = userId;
	}
	public String getEventCode() {
		return eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}
	public String getCount() {
		return orderCount;
	}
	public void setCount(String count) {
		this.orderCount = count;
	}
	public String getMoney() {
		return orderMoney;
	}
	public void setMoney(String money) {
		this.orderMoney = money;
	}
	@Override
	public String toString() {
		return "UserOrder [orderDate=" + orderDate + ", orderNo=" + orderNo + ", accountNo=" + accountNo + ", customerId="
				+ userId + ", eventCode=" + eventCode + ", count=" + orderCount + ", money=" + orderMoney + "]";
	}
	

}
