package com.kh.soundcastadmin.member.controller;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.soundcastadmin.member.model.service.MemberService;
import com.kh.soundcastadmin.member.model.vo.Member;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController // Controller + ResponseBody, responsebody => 주소를 리턴하는 것이 아닌 데이터를 직접 리턴
@RequiredArgsConstructor
public class MemberController {
	
	private final MemberService memberService;
	
	@GetMapping("/members")
	public List<Member> members(HttpServletResponse response){
		
		List<Member> list = memberService.selectMembers();
		log.debug("list {}", list);
		
		response.setHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "http://localhost:3000");
		
		return list;
	}
}
