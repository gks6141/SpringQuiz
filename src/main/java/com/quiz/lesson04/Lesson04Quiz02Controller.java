package com.quiz.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.lesson04.bo.RealtorBO;
import com.quiz.lesson04.domain.Realtor;

@Controller
@RequestMapping("/lesson04/quiz02")
public class Lesson04Quiz02Controller {
	@Autowired
	private RealtorBO realtorBO;
	
	@GetMapping("/add-realtor-view")
	public String quiz04() {
		return "lesson04/addRealtor";
	}
	
	@PostMapping("/add-realtor")
	public String quiz04_1(Realtor realtor,Model model) {
		
		//insert
		realtorBO.addRealtor(realtor);
		//id얻기
		
		//select
		
		//model
		model.addAttribute("title","공인중개사 추가");
		model.addAttribute("result");
		
		return "lesson04/addLatestRealtor";
	}
}
