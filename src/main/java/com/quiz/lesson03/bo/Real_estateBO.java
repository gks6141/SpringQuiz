package com.quiz.lesson03.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson03.domain.Real_estate;
import com.quiz.lesson03.mapper.Real_estateMapper;

@Service
public class Real_estateBO {

	@Autowired
	private Real_estateMapper real_estateMapper;
	
	//ID 조회
	public Real_estate getRealEstateById(int id) {
		return real_estateMapper.selectRealEstateById(id);
	}
	
	//월세 이하 조회
	public List<Real_estate> getRealEstateByRentPrice(int rent_price) {
		return real_estateMapper.selectRealEstateByRentPrice(rent_price);
	}
	
	//매매 기준 평수, 가격 조회 
	public List<Real_estate> getRealEstateByAreaPrice(int area, int price){
		return real_estateMapper.selectRealEstateByAreaPrice(area,price);
	}
}
