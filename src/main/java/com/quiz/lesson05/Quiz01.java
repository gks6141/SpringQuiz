package com.quiz.lesson05;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson05/quiz01")
@Controller
public class Quiz01 {
	
	@GetMapping("/1")
	public String quiz01_1(Model model) {
		double i = 36;
		double j = 3;
		
		model.addAttribute("i",i);
		model.addAttribute("j",j);
		return "lesson05/quiz01";
	}
}
