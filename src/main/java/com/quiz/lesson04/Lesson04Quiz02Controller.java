package com.quiz.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public String quiz04_1(
			@ModelAttribute Realtor realtor,Model model) {
		
		//insert
		realtorBO.addRealtor(realtor);
		//동적 id로 select
		realtor = realtorBO.getRealtorById(realtor.getId());
		//model
		model.addAttribute("result",realtor);
		
		return "lesson04/addLatestRealtor";
	}
}
