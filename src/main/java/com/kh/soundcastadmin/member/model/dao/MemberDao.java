package com.kh.soundcastadmin.member.model.dao;

import java.util.List;
import java.util.Map;

import com.kh.soundcastadmin.member.model.vo.MemberExt;

public interface MemberDao {

	List<MemberExt> selectMembers();

	List<MemberExt> searchMembers(Map<String, Object> param);

	int deleteMembers(List<Long> deleteList);

}
