package com.quiz.lesson04;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/lesson04/quiz02")
public class Lesson04Quiz02Controller {
	
	@GetMapping("/add-realtor-view")
	public String quiz04() {
		return "lesson04/addRealtor";
	}
	
	@PostMapping("/add-realtor")
	public String quiz04_1(
			@RequestParam("office") String office,
			@RequestParam("phoneNumber") String phoneNumber,
			@RequestParam("address") String address,
			@RequestParam("grade") String grade,
			Model model) {
		
		//insert
		
		//id얻기
		
		//select
		
		//model
		model.addAttribute("title","공인중개사 추가");
		
		return "lesson04/addLatestRealtor";
	}
}
