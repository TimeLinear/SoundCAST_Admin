package com.kh.soundcastadmin.song.model.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImagePath {
	private int imagePathNo; // 음원 커버 이미지 경로 번호
	private String imagePathName; // 음원 커버 이미지 경로명
}
