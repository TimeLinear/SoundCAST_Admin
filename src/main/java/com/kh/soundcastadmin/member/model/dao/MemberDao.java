package com.kh.soundcastadmin.member.model.dao;

import java.util.List;

import com.kh.soundcastadmin.member.model.vo.Member;
import com.kh.soundcastadmin.member.model.vo.MemberExt;

public interface MemberDao {

	List<MemberExt> selectMembers();

}
