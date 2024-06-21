package com.quiz.lesson05;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson05/quiz01")
@Controller
public class Lesson05Quiz01Controller {
	
	@GetMapping("/1")
	public String quiz01_1(Model model) {
		return "lesson05/quiz01";
	}
}
