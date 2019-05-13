package kr.or.ksmart.model.service;

import java.util.List;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import kr.or.ksmart.model.mapper.*;
import kr.or.ksmart.model.vo.*;


@Service
@Transactional
public class ModelService {
	@Autowired
	private UserMapper UserMapper;
	@Autowired
	private AccountMapper accountMapper;
	@Autowired
	private BranchMapper branchMapper;
	@Autowired
	private UserOrderMapper userOrderMapper;
	
	// 로그인
	public String getUser(User user,HttpSession session) {
		User loginUser = UserMapper.selectUser(user.getUserId());
	
		if(user.getUserId().equals(loginUser.getUserId()) && user.getUserPw().equals(loginUser.getUserPw())) {
			session.setAttribute("loginUser", loginUser);
			return "redirect:/index#";
		}else {
			return "redirect:/index";
		}
	}
	// 로그 아웃
	public void logout(HttpSession session) {
		session.invalidate();
	}

//계좌 관련 서비스 구분	
	
	//계좌 개설 폼용
	public List<Branch> account() {
		return branchMapper.allSelectBranch();
	}
	
	// 계좌 개설
	public void accountAdd(Account account) {
		System.out.println("ModelService.java accountadd 실행" );
		Branch branch = branchMapper.selectBranch(account.getBranchNo());
		account.setAccountManager(branch.getBranchManager());
		account.setAccountOpenBranch(branch.getBranchName());
		System.out.println("ModelService.java = " + account );
		accountMapper.insertAccount(account);
	}
	//회원 계좌 리스트 가져오기
	public List<Account> getAccountList(HttpSession session) {
		User user = (User)session.getAttribute("loginUser");
		System.out.println("getAccountOne="+user);
		return accountMapper.selectAccount(user.getUserId());
	}

//주문 관련 서비스 구분
	
	//주문 완료
	public void orderAction(UserOrder userOrder) {
		userOrderMapper.insertOrder(userOrder);
	}
	
	//해당 유저 주문 리스트
	public List<UserOrder> getOrderList(HttpSession session){
		User user = (User)session.getAttribute("loginUser");
		return userOrderMapper.selectOrderList(user.getUserId());		
	}
	
	//해당 주문의 정보를 가져옴
	public UserOrder getOrderOne(int orderNo) {		
		return userOrderMapper.selectOrderOne(orderNo);		
	}
	
	//해당 계좌에 대한 주문 정보 가져오기
	public List<UserOrder> selectAccounNoOrderList(String accounNo){
		return userOrderMapper.selectAccounNoOrderList(accounNo);		
	}
}
