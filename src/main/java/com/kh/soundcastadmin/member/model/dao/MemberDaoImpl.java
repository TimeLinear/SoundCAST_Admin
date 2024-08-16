package com.kh.soundcastadmin.member.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.soundcastadmin.member.model.vo.MemberExt;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MemberDaoImpl implements MemberDao{

	private final SqlSessionTemplate session;
	
	@Override
	public List<MemberExt> selectMembers() {
		return session.selectList("member.selectMembers");
	}

}
