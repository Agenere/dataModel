package kr.or.ksmart.dataModel.vo;

public class Account {
	private int accountNo ;
	private String customerId;
	private String accountName;
	private int deposit;
	private String accountOpenBranch;
	private String accountManager ;
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
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public String getAccountOpenBranch() {
		return accountOpenBranch;
	}
	public void setAccountOpenBranch(String accountOpenBranch) {
		this.accountOpenBranch = accountOpenBranch;
	}
	public String getAccountManager() {
		return accountManager;
	}
	public void setAccountManager(String accountManager) {
		this.accountManager = accountManager;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", customerId=" + customerId + ", accountName=" + accountName
				+ ", deposit=" + deposit + ", accountOpenBranch=" + accountOpenBranch + ", accountManager="
				+ accountManager + "]";
	}
	
	
}
