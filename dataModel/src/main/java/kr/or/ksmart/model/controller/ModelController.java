package kr.or.ksmart.model.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import kr.or.ksmart.model.service.ModelService;
import kr.or.ksmart.model.vo.Account;
import kr.or.ksmart.model.vo.UserOrder;
import kr.or.ksmart.model.vo.User;

@Controller
public class ModelController {
	@Autowired ModelService modelService;
	// 1. index(get 방식)
	
	//세션에 값이 없을 땐 무조건 로그인 창이 포워드 된다
	@GetMapping("/index")
	public String index(Model model,HttpSession session) {
		if(session.getAttribute("loginUser") != null) {
			List<Account> accountList = modelService.getAccountList(session);
			List<UserOrder> orderList =modelService.getOrderList(session);	
			model.addAttribute("accountList",accountList);
			model.addAttribute("orderList", orderList);			
			return "user";
		}else {
			return "index";
		}		
	}
	
	// 1-1. login(post 방식)
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
	public String user(Model model,HttpSession session) {
		List<Account> accountList = modelService.getAccountList(session);
		List<UserOrder> orderList =modelService.getOrderList(session);	
		model.addAttribute("accountList",accountList);
		model.addAttribute("orderList", orderList);
		
		return "user";
	}
	
	
	  // 3. 계좌 개설(getAccount) get 방식
	  
	  @GetMapping("/accountAdd") public String accountAdd(Model model) {
	  model.addAttribute("branchList",modelService.account()); return "accountadd";
	  }
	 
	
	// 3-1  계좌 개설 action (post방식)
	@PostMapping("/accontAddAction")
	public String accontAddAction(Account account) {
		System.out.println("accontAddAction 실행" );
		modelService.accountAdd(account);
		
		return "redirect:/user#account";
		
	}
	/*
	 * // 4 주문 get 방식
	 * 
	 * @GetMapping("/orderAdd") public String orderAdd(Model model,HttpSession
	 * session) { List<Account> accountList = modelService.getAccountList(session);
	 * System.out.println("orderAdd = "+accountList);
	 * model.addAttribute("accountList",accountList); return "orderAdd";
	 * 
	 * }
	 */
	
	// 4-1. 주문 action (post 방식)
	@PostMapping("/orderAdd")
	public String orderAction(UserOrder userOrder) {
		System.out.println("orderAction = "+userOrder);
		modelService.orderAction(userOrder);
		return "redirect:/user#oderList";
		
	}
	
	/*
	 * // 5. 계좌 리스트(get 방식)
	 * 
	 * @GetMapping("/listAccount") public String listAccount(Model model,HttpSession
	 * session) { List<Account> accountList = modelService.getAccountList(session);
	 * System.out.println("orderAdd = "+accountList);
	 * model.addAttribute("accountList",accountList); return "listAccount"; }
	 */
	
	// 6. 주문 List(get 방식)
	@GetMapping("/listOrder")
	public String ListOder(Model model,HttpSession session) {
		List<UserOrder> orderList =modelService.getOrderList(session);
		model.addAttribute("orderList", orderList);
		return "listOrder";
		
	}
}
