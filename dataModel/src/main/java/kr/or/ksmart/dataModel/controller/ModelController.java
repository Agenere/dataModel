package kr.or.ksmart.dataModel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ModelController {
	// 1. index(get 방식)
	@GetMapping("/index")
	public String user() {
		return "index";
	}
	// 1-1. logout(get 방식)
	@PostMapping("/index")
	public String user(@RequestParam(value="userId")String Id,
					   @RequestParam(value="userPw")String Pw) {
		
		return "Rediect:/";
	}
	
	// 2. 유저정보(getCustomer) get방식
	
	// 3. 계좌 개설(getAccount) get 방식
	
	// 3-1  계좌 개설 action (post방식)
	
	// 4 주문  get 방식
	
	// 4-1. 주문 action (post 방식)
	
	// 5. 계좌 리스트(get 방식)
	
	// 6. 주문 List(get 방식)
}
