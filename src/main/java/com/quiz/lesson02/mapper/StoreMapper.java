package com.quiz.lesson02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.lesson02.domain.Store;

@Mapper
public interface StoreMapper {

	// input: x
	// output: List<Store>
	public List<Store> selectStoreList();
	
	public List<Store> selectStoreByStoreId(int StoreId);
}
