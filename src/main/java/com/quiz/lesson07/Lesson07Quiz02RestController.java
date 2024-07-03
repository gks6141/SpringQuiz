package com.quiz.lesson07;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson07.entity.RecruitEntity;
import com.quiz.lesson07.repository.RecruitRepository;

@RestController
@RequestMapping("/lesson07/quiz02")
public class Lesson07Quiz02RestController {
	
	@Autowired
	private RecruitRepository recruitRepository;
	
	@GetMapping("1")
	public Optional<RecruitEntity> selectById(){
		return recruitRepository.findById(8);
		
	}
	
	@GetMapping("2")
	public List<RecruitEntity> selectByParameter(){
		return recruitRepository.findByCompanyId(1);
		
	}
}
