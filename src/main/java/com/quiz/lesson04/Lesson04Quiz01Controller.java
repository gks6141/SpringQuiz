package com.quiz.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quiz.lesson04.bo.SellerBO;
import com.quiz.lesson04.domain.Seller;

@RequestMapping("/lesson04/quiz01")
@Controller
public class Lesson04Quiz01Controller {
	
	@Autowired
	private SellerBO sellerBO;
	
	@GetMapping("/add-seller-view")
	public String quiz04() {
		
		return "lesson04/addSeller";
	}
	
	@PostMapping("/add-seller")
	public String quiz01_1(
			@RequestParam("nickname") String nickname,
			@RequestParam(value = "profileImageUrl" ,required = false) String profileImageUrl,
			@RequestParam(value = "temperature" ,required = false) Double temperature){
		//DB insert
		sellerBO.addSeller(nickname, profileImageUrl, temperature);
		
		return "lesson04/afterAddSeller";
	}
	
	@GetMapping("seller-info-view")
	public String quiz01_2(Model model) {
		Seller seller = sellerBO.getLatestSeller();
		
		model.addAttribute("result", seller);
		
		return "lesson04/latestSeller";
	}
	
}
