package kr.or.ksmart.model.vo;

public class Order {
	private String orderDate;
	private int orderNo;
	private int accountNo;
	private String customerId;
	private int eventCode;
	private int count;
	private int money;
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
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public int getEventCode() {
		return eventCode;
	}
	public void setEventCode(int eventCode) {
		this.eventCode = eventCode;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Order [orderDate=" + orderDate + ", orderNo=" + orderNo + ", accountNo=" + accountNo + ", customerId="
				+ customerId + ", eventCode=" + eventCode + ", count=" + count + ", money=" + money + "]";
	}
	
	

}
