package com.kh.soundcastadmin.song.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Report {
	private int reportNo; // 신고 번호
	private int reportSongNo; // 신고된 음원 번호
	private int reportMemberNo; // 신고자 회원 번호
	private String reportText; // 신고내용
	private String reportDate; // 신고일자
}
