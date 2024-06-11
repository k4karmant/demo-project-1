package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.CalcBean;
import com.bean.UserBean;


@Controller
public class SessionController {

	
	@GetMapping("/login")
	public String login(){
		return "Login";
	}
	
	@GetMapping("/signup")
	public String signup(){
		return "Signup";
	}
	
	@GetMapping("/fp")
	public String forgetPassword(){
		return "ForgetPassword";
	}
	
	@GetMapping("/calc")
	public String Calc() {
		return "Calc";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(UserBean userBean,Model model) {
		 //read -> temp class-> bean  -> data set 
		System.out.println("firstName => "+userBean.getUserName());
		System.out.println("email => "+userBean.getEmail());
		System.out.println("password => "+userBean.getPassword());
		 
		model.addAttribute("user",userBean);//dataName,dataValue
		//Model 
		return "Home";
	}
	
	@PostMapping("/calculate")
	public String calculate(CalcBean calcBean, Model model) {
		calcBean.setSum(calcBean.getNum1(), calcBean.getNum2());
		model.addAttribute("calc", calcBean);
		return "Calculate";
	}
	
}