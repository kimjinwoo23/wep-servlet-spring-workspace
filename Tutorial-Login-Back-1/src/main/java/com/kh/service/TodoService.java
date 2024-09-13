package com.kh.service;

import java.util.Map;

import com.kh.dto.TodoMember;

public interface TodoService {

	int idCheck(String id );
	int signup(TodoMember member);
	
	Map<String,Object> login(TodoMember member);
	
}
