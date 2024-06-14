package com.quiz.lesson03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.bo.Real_estateBO;
import com.quiz.lesson03.domain.Real_estate;

@RequestMapping("/lesson03/quiz01")
@RestController
public class Lesson03Quiz01RestController {
	
	@Autowired
	private Real_estateBO real_estateBO;
	
	//ID 조회
	@RequestMapping("/1")
	public Real_estate quiz01_1(
			@RequestParam("id") int id) {
		return real_estateBO.getRealEstateById(id);
	}
	
	//월세 이하 조회
	@RequestMapping("/2")
	public List<Real_estate> quiz01_2(
			@RequestParam("rent_price") int rent_price) {
		return real_estateBO.getRealEstateByRentPrice(rent_price);
	}
	
	//매매 기준 평수, 가격 조회 
	@RequestMapping("/3")
	public List<Real_estate> quiz01_3(
			@RequestParam("area") int area
			,@RequestParam("price") int price) {
		return real_estateBO.getRealEstateByAreaPrice(area, price);
	}
}
