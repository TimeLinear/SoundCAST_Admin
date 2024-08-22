package com.kh.soundcastadmin.member.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.kh.soundcastadmin.member.model.dao.MemberDao;
import com.kh.soundcastadmin.member.model.vo.MemberExt;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

	private final MemberDao memberDao;
	
	public List<MemberExt> selectMembers() {
		return memberDao.selectMembers();
	}

	@Override
	public List<MemberExt> searchMembers(Map<String, Object> param) {
		return memberDao.searchMembers(param);
	}

	@Override
	public int deleteMembers(List<Long> deleteList) {
		return memberDao.deleteMembers(deleteList);
	}
	
}
