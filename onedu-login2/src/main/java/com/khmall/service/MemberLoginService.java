package com.khmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khmall.dto.MembersLogin;
import com.khmall.mapper.MembersMapperLogin;






@Service
public class MemberLoginService {
	@Autowired
	private MembersMapperLogin membersMapper;

	public MembersLogin getLogin(String members_id, String members_pw) {
		return membersMapper.getLogin(members_id, members_pw);
	}

}