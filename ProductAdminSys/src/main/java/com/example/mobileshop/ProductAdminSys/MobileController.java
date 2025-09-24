package com.example.mobileshop.ProductAdminSys;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MobileController {

	@GetMapping("/login")
	public String loginForm() {
		return "login.html";
	}
		
	
	@PostMapping("/login")
		public String login(@RequestParam String usernm,@RequestParam String passwd){
			if(usernm.equals("admin")&& passwd.equals("admin123")) {
				return "redirect:/success";
			}
			return "login.html";
		}
	
	@GetMapping("/success")
	public String Logged() {
		
      return "success.html";
	}

	}

