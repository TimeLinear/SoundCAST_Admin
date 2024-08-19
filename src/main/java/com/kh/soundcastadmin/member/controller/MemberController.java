package com.kh.soundcastadmin.member.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.soundcastadmin.member.model.service.MemberService;
import com.kh.soundcastadmin.member.model.vo.MemberExt;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/member")
@RestController // Controller + ResponseBody, responsebody => 주소를 리턴하는 것이 아닌 데이터를 직접 리턴
@RequiredArgsConstructor
public class MemberController {
	
	private final MemberService memberService;
	
	@CrossOrigin(origins = {"*"})
	@GetMapping("/selectMembers")
	public List<MemberExt> selectMembers(HttpServletResponse response){
		
		List<MemberExt> list = memberService.selectMembers();
		log.debug("list {}", list);
		
		//response.setHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "http://localhost:3000");
		
		return list;
	}
	
	@CrossOrigin(origins = {"*"})
	@GetMapping("/searchMembers/type/{type}/searchTerm/{searchTerm}")
	public List<MemberExt> searchMembers(
			@PathVariable String type ,
			@PathVariable String searchTerm
			){
		log.debug("type = {}, searchTerm = {}", type, searchTerm);
		Map<String, Object> param = new HashMap<>();
		param.put("type", type);
		param.put("searchTerm", searchTerm);
		
		List<MemberExt> list = memberService.searchMembers(param);
		
		log.debug("list {}", list);
		
		return list;
	}
}
