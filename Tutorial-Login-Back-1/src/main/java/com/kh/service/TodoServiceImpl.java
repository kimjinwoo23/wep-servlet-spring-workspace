package com.kh.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.kh.dto.TodoMember;
import com.kh.mapper.TodoMapper;

/*
 Service ServiceImple 
 Service = 코드 작성하는 데 있어 이런서비스를 사용하겠다는 
 계약 정의  어떤 메서드들(기능들)이 어떤 역할을하는지 정의 
 ServiceImple = 인터페이스로 작성한 service의 실제기능을 작성 
 비슷한 기능을 각 서비스에 맞춰서 사용하겠다는 의미
 
 
 
 */
@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoMapper mapper;
	
	@Override
	public int idCheck(String id ) {
		return mapper.idCheck(id);
	}
	@Override
	public int signup(TodoMember member) {
		return mapper.signup(member);
	}
	
	public Map<String,Object> login(TodoMember member){
		TodoMember loginMember = mapper.login(member);
		
		Map<String,Object> map = new HashMap<>();
		map.put("loginMember", loginMember);
		return map;
	}

}
