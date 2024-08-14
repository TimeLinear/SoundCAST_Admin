package com.kh.soundcastadmin.member.model.dao;

import java.util.List;

import com.kh.soundcastadmin.member.model.vo.Member;

public interface MemberDao {

	List<Member> selectMembers();

}
