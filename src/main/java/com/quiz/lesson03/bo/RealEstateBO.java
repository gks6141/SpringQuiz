package com.quiz.lesson03.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson03.domain.RealEstate;
import com.quiz.lesson03.mapper.RealEstateMapper;

@Service
public class RealEstateBO {

	@Autowired
	private RealEstateMapper realEstateMapper;
	
	//ID 조회
	public RealEstate getRealEstateById(int id) {
		return realEstateMapper.selectRealEstateById(id);
	}
	
	//월세 이하 조회
	public List<RealEstate> getRealEstateByRentPrice(int rent_price) {
		return realEstateMapper.selectRealEstateByRentPrice(rent_price);
	}
	
	//매매 기준 평수, 가격 조회 
	public List<RealEstate> getRealEstateByAreaPrice(int area, int price){
		//과거에는 map을 만들어서 진행햇지만 mybatis에서 어노테이션을 만들어줫다.
		return realEstateMapper.selectRealEstateByAreaPrice(area,price);
	}
	
	//객체 insert
	public int addRealEstate(RealEstate realEstate) {
		return realEstateMapper.insertRealEstate(realEstate);
	}
	
//	addRealEstateAsField(realtorId, "썅떼빌리버 오피스텔 814호",
//			45, "월세", 100000, 120);
	public int addRealEstateAsField(int realtorId, String address, int area,
			String type, int price, int rentPrice) {
		return realEstateMapper.insertRealEstateAsField(realtorId, address, area, type, price, rentPrice);
	}
	
	//input : id, type, price
	//output: int
	public int updateRealEstateById(int id, String type, int price) {
		return realEstateMapper.updateRealEstateById(id, type, price);
	}
	
	public int deleteRealEstateById(int id) {
		return realEstateMapper.deleteRealEstateById(id);
	}
}
