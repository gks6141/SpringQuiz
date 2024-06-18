package com.quiz.lesson03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.quiz.lesson03.domain.RealEstate;

@Mapper
public interface RealEstateMapper {

	//ID 조회
	public RealEstate selectRealEstateById(int id);
	
	//월세 이하 조회
	public List<RealEstate> selectRealEstateByRentPrice(int rent_price);
	
	//매매 기준 평수, 가격 조회 
	//mapper 인터페이스가 xml로 파라미터 전송 시 1개만 보낼 수 있다.
	//@Param 어노테이션을 사용하면 파라미터를 하나의 맵으로 구성해준다.
	public List<RealEstate> selectRealEstateByAreaPrice(
			@Param("area") int area,
			@Param("price") int price);
	
	//객체 insert
	public int insertRealEstate(RealEstate realEstate);
	
	public int insertRealEstateAsField(
			@Param("realtorId") int realtorId, 
			@Param("address") String address, 
			@Param("area") int area,
			@Param("type") String type, 
			@Param("price") int price, 
			@Param("rentPrice") int rentPrice);
	
	//input : id, type, price
	//output: int
	//데이터 수정
	public int updateRealEstateById(
			@Param("id") int id, 
			@Param("type") String type, 
			@Param("price") int price);
	
	public int deleteRealEstateById(int id);
}
