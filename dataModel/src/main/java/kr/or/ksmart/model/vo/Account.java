package kr.or.ksmart.model.vo;

public class Account extends Branch{
	private String accountNo ;
	private String userId;
	private String accountName;
	private String accountDeposit;
	private String accountOpenBranch;
	private String accountManager ;
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
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountDeposit() {
		return accountDeposit;
	}
	public void setAccountDeposit(String accountDeposit) {
		this.accountDeposit = accountDeposit;
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
		return "Account [accountNo=" + accountNo + ", userId=" + userId + ", accountName=" + accountName
				+ ", accountDeposit=" + accountDeposit + ", accountOpenBranch=" + accountOpenBranch
				+ ", accountManager=" + accountManager + "]";
	}
	
}
