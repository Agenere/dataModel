package kr.or.ksmart.model.vo;

public class UserOrder {
	private String orderDate;
	private int orderNo;
	private String accountNo;
	private String userId;
	private String eventCode;
	private int orderCount;
	private int orderMoney;
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEventCode() {
		return eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}
	public int getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}
	public int getOrderMoney() {
		return orderMoney;
	}
	public void setOrderMoney(int orderMoney) {
		this.orderMoney = orderMoney;
	}
	@Override
	public String toString() {
		return "UserOrder [orderDate=" + orderDate + ", orderNo=" + orderNo + ", accountNo=" + accountNo + ", userId="
				+ userId + ", eventCode=" + eventCode + ", orderCount=" + orderCount + ", orderMoney=" + orderMoney
				+ "]";
	}
	

}
