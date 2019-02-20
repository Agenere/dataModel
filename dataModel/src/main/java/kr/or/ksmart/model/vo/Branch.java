package kr.or.ksmart.model.vo;

public class Branch {
	private int branchNo;
	private String branchName;
	private String branchManager;
	public int getBranchNo() {
		return branchNo;
	}
	public void setBranchNo(int branchNo) {
		this.branchNo = branchNo;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchManager() {
		return branchManager;
	}
	public void setBranchManager(String branchManager) {
		this.branchManager = branchManager;
	}
	@Override
	public String toString() {
		return "Branch [branchNo=" + branchNo + ", branchName=" + branchName + ", branchManager=" + branchManager + "]";
	}
	
	

}
