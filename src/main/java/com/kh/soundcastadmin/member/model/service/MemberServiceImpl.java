package com.kh.soundcastadmin.member.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kh.soundcastadmin.member.model.dao.MemberDao;
import com.kh.soundcastadmin.member.model.vo.Member;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

	private final MemberDao memberDao;
	
	public List<Member> selectMembers() {
		return memberDao.selectMembers();
	}
	
}
