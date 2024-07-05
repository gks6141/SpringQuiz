package com.quiz.lesson07.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.lesson07.entity.RecruitEntity;

public interface RecruitRepository extends JpaRepository<RecruitEntity , Integer>{
	public List<RecruitEntity> findByCompanyId(int id);
	public List<RecruitEntity> findByPositionAndType(String position,String type);
	public List<RecruitEntity> findByTypeOrSalaryGreaterThanEqual(String Type,int salary);
	public List<RecruitEntity> findTop3ByTypeOrderBySalaryDesc(String type);
	public List<RecruitEntity> findByRegionAndSalaryBetween(String region, int start,int end);
	

}
