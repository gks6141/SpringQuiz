package com.quiz.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quiz.lesson02.bo.StoreBO;
import com.quiz.lesson02.domain.Store;

@Controller
@RequestMapping("/lesson05/quiz06")
public class StoreReviewController {
	
	@Autowired
	private StoreBO storeBO;
	
	
	@GetMapping("/store-view")
	public String storeView(Model model) {
		List<Store> store = storeBO.getStoreList();
		model.addAttribute("stores", store);
		return "storeReview/storeView";
	}
	
	@GetMapping("/reviews")
	public String reviewView(
			@RequestParam("storeId") int storeId,
			@RequestParam("storeName") String storeName, Model model) {
		
		List<Store> review = storeBO.getStoreByStoreId(storeId);
		
		model.addAttribute("storeName", storeName);
		model.addAttribute("review", review);
		return "storeReview/reviewView";
	}
	
}
