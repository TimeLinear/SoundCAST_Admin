package com.kh.soundcastadmin.member.model.service;

import java.util.List;
import java.util.Map;

import com.kh.soundcastadmin.member.model.vo.MemberExt;

public interface MemberService {

	List<MemberExt> selectMembers();

	List<MemberExt> searchMembers(Map<String, Object> param);

}
