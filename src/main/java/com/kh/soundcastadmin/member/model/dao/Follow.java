package com.kh.soundcastadmin.member.model.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Follow {
	private int followMemberNo;
	private int followTargetMemberNo;
}
