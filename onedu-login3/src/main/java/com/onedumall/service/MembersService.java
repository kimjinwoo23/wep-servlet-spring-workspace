package com.onedumall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onedumall.dto.Members;
import com.onedumall.mapper.MembersMapper;








@Service
public class MembersService {
	@Autowired
	private MembersMapper membersMapper;

	public Members getLogin(String members_id, String members_pw) {
		return membersMapper.getLogin(members_id, members_pw);
	}

}