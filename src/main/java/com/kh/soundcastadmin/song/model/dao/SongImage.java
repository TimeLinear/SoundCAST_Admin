package com.kh.soundcastadmin.song.model.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SongImage {
	private int songImageNo; // 음원 커버 이미지 번호
	private int songImagePathNo; // 음원 커버 이미지 경로 번호
	private String songImageName; // 음원 커버 이미지 파일명
}
