package com.quiz.lesson03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.lesson03.domain.Real_estate;

@Mapper
public interface Real_estateMapper {

	//ID 조회
	public Real_estate selectRealEstateById(int id);
	
	//월세 이하 조회
	public List<Real_estate> selectRealEstateByRentPrice(int rent_price);
	
	//매매 기준 평수, 가격 조회 
	public List<Real_estate> selectRealEstateByAreaPrice(int area,int price);
}
