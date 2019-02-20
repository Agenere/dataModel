package kr.or.ksmart.dataModel.vo;

public class user {
	private String userId;
	private String userPw;
	private String userAddr;
	private int userPhone;
	private int branchNo;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	public int getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(int userPhone) {
		this.userPhone = userPhone;
	}
	public int getBranchNo() {
		return branchNo;
	}
	public void setBranchNo(int branchNo) {
		this.branchNo = branchNo;
	}
	@Override
	public String toString() {
		return "user [userId=" + userId + ", userPw=" + userPw + ", userAddr=" + userAddr + ", userPhone=" + userPhone
				+ ", branchNo=" + branchNo + "]";
	}	
	
	
}
