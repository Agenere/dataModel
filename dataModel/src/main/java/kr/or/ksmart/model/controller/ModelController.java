package kr.or.ksmart.model.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.ksmart.model.service.ModelService;
import kr.or.ksmart.model.vo.User;

@Controller
public class ModelController {
	@Autowired ModelService modelService;
	// 1. index(get 방식)
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	// 1-1. logout(get 방식)
	@PostMapping("/index")
	public String index(User user,HttpSession session) {		
		return modelService.getUser(user, session);
	}
	//1-2. logout
	@GetMapping("logout")
	public String logout(HttpSession session) {
		modelService.logout(session);
		return "redirect:/index";
	}
	
	// 2. 유저정보(getCustomer) get방식
	@GetMapping("/user")
	public String user() {
		return "user";
	}
	// 3. 계좌 개설(getAccount) get 방식
	@GetMapping("/accountadd")
	public String accountadd(HttpSession session,Model model) {
		model.addAttribute("branch",modelService.account(session));
		return "accountadd";
	}
	
	// 3-1  계좌 개설 action (post방식)
	//@PostMapping("/accountadd")
	
	// 4 주문  get 방식
	
	// 4-1. 주문 action (post 방식)
	
	// 5. 계좌 리스트(get 방식)
	
	// 6. 주문 List(get 방식)
}
