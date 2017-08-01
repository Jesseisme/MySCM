package cn.itcast.scm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.scm.entity.Account;
import cn.itcast.scm.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountControlller {
	@Resource
	private AccountService accountService;
	
	@RequestMapping("/login")
	public String login(Account account,HttpServletRequest request,HttpSession session){
		System.out.println("------login:"+account);
		Account acc = accountService.login(account);
		if(acc!=null){
			//存session
			session.setAttribute("account", acc);
			return "forward:/WEB-INF/main/main.jsp";
		}else {
			request.setAttribute("msg", "用户名或密码错误！");
			return "forward:/login.jsp";
		}
		
		
	}
	
}
