package com.kh.soundcastadmin.member.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberGrade {
	private int memberGradeNo;
	private String memberGradeName; // 한글로 5글자 이내
}
