package com.kh.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.dto.TodoMember;
import com.kh.service.TodoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController // spring boot 어플리케이션(폴더 안에서) html코드를작성하는게 아니라
//react 나 외부에서 url 주소를 공유할때 사용 
public class TodoController {

	@Autowired
	private TodoService service;
	
	/*
	 아이디 중복검사 @param(매겨변수로 중간에 개입해서 값을 변하게함)
	 @param id 값을 가져와서 아이디 중복 결과를 보여줄것 
	 @return 아이디 중복확인후에 결과를 되돌려 줌 
	 */
	
	@GetMapping("idCheck")
	public int idCheck(@RequestParam("id") String id) {
		return service.idCheck(id);
	}
	/**
	 @param member 회원 가입할때 작성한 정보를 모두 가져오기 
	 @return 회원가입에 성공하면 1 실패시 0  
	 */
	@PostMapping(value="/signup")
	public int signup(@RequestBody TodoMember member) {
		return service.signup(member);
	}
	
	@PostMapping("/login")
	public Map<String,Object> login(@RequestBody TodoMember member){
		return service.login(member);
	}
	
}











