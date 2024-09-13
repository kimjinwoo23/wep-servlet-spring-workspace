package com.kh.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kh.dto.TodoMember;

@Mapper
public interface TodoMapper {
	int idCheck(String id);
	
	int signup(TodoMember member);
	
	TodoMember login(TodoMember member);
	TodoMember login(String id, String pw);
}