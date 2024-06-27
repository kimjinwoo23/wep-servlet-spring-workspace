package com.khmall.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.khmall.service.EmailService;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Controller
public class MailController {
@Autowired
	private EmailService mailservice;
	
	@GetMapping("/")
	public String MailPage() {
		return "index";
	}
	@ResponseBody
	@PostMapping("/mail")
	public String mailsend(String mail) {
		int number = mailservice.sendMail(mail);
		String num = ""+number;
		
		return num;
		
	}

}
