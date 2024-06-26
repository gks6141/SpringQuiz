package com.quiz.lesson06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lesson06")
public class Lesson06Controller {
	
	@GetMapping	("/add-bookmark-view")
	public String addBookmarkView() {
		return "lesson06/addBookmarkView";
	}
	
	
	@PostMapping("/lesson06/add-bookmark")
	public String addBookmark() {
		return "성공";
	}
	
	
	
	@GetMapping("/lesson06/bookmark-list-view")
	public String bookmarkListView() {
		return "lesson06/bookmarkListView";
	}
}
