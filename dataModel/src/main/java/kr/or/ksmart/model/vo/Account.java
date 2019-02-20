package kr.or.ksmart.model.vo;

public class Account {
	private int accountNo ;
	private String userId;
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
		return "Account [accountNo=" + accountNo + ", userId=" + userId + ", accountName=" + accountName + ", deposit="
				+ deposit + ", accountOpenBranch=" + accountOpenBranch + ", accountManager=" + accountManager + "]";
	}
	
	
}
