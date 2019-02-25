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
	// 로그인
	public String getUser(User user,HttpSession session) {
		User loginUser = UserMapper.selectUser(user.getUserId());
	
		if(user.getUserId().equals(loginUser.getUserId()) && user.getUserPw().equals(loginUser.getUserPw())) {
			session.setAttribute("loginUser", loginUser);
			return "redirect:/user";
		}else {
			return "redirect:/index";
		}
	}
	// 로그 아웃
	public void logout(HttpSession session) {
		session.invalidate();
	}
	
	//계좌 개설 폼용
	public List<Branch> account() {
		return branchMapper.allSelectBranch();
	}
	
	// 계좌 개설
	public void accountadd(Account account) {
		System.out.println("ModelService.java accountadd 실행" );
		Branch branch = branchMapper.selectBranch(account.getBranchNo());
		account.setAccountManager(branch.getBranchManager());
		account.setAccountOpenBranch(branch.getBranchName());
		System.out.println("ModelService.java = " + account );
		accountMapper.insertAccount(account);
	}
}
