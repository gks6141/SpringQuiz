package com.quiz.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.lesson02.bo.StoreBO;
import com.quiz.lesson02.domain.Store;

@Controller
@RequestMapping("/lesson05/quiz06")
public class StoreReviewController {
	
	@Autowired
	private StoreBO storeBO;
	
	
	@GetMapping("/review-view")
	public String reviewView(Model model) {
		List<Store> store = storeBO.getStoreList();
		model.addAttribute("store", store);
		return "lesson05/reviewView";
	}
	
}
