package kr.or.ksmart.model.vo;

public class Order {
	private String orderDate;
	private String orderNo;
	private String accountNo;
	private String customerId;
	private String eventCode;
	private String count;
	private String money;
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getEventCode() {
		return eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Order [orderDate=" + orderDate + ", orderNo=" + orderNo + ", accountNo=" + accountNo + ", customerId="
				+ customerId + ", eventCode=" + eventCode + ", count=" + count + ", money=" + money + "]";
	}
	

}
