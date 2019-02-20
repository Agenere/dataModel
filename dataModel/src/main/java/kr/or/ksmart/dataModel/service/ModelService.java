package kr.or.ksmart.dataModel.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.ksmart.dataModel.mapper.ModelMapper;
import kr.or.ksmart.dataModel.vo.User;

@Service
@Transactional
public class ModelService {
	@Autowired
	private ModelMapper modelMapper;
	
	public String getUser(User user,HttpSession session) {
		User loginUser = modelMapper.selectUser(user);
	
		if(user.getUserId().equals(loginUser.getUserId()) && user.getUserPw().equals(loginUser.getUserPw())) {
			session.setAttribute("loginUser", loginUser);
			return "redirect:/user";
		}else {
			return "redirect:/index";
		}
	}
	
	public void logout(HttpSession session) {
		session.invalidate();
	}
}
