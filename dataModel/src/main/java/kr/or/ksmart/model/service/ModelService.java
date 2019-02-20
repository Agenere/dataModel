package kr.or.ksmart.model.service;

import java.util.HashMap;
import java.util.Map;

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
	public Branch account(HttpSession session) {
		User user = (User)session.getAttribute("loginUser");	
		return branchMapper.selectBranch(user.getBranchNo());
	}
	
	// 계좌 개설
	public void accountadd(Account account) {
		Map<String,Object> map = new HashMap<String,Object>(); 
		map.put("randomNo", (int)(Math.random()*100)+1);
		map.put("branchNo", UserMapper.selectUser(account.getUserId()).getBranchNo());
		map.put("account", account);
		accountMapper.insertAccount(map);
	}
}
