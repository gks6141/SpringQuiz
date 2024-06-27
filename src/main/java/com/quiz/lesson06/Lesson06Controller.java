package com.quiz.lesson06;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quiz.lesson06.bo.BookmarkBO;
import com.quiz.lesson06.domain.Bookmark;

@Controller
@RequestMapping("/lesson06")
public class Lesson06Controller {
	@Autowired
	private BookmarkBO bookmarkBO;
	
	@GetMapping	("/add-bookmark-view")
	public String addBookmarkView() {
		return "lesson06/addBookmarkView";
	}
	
	// AJAX가 하는 요청
	@ResponseBody
	@PostMapping("/add-bookmark")
	public String addBookmark(
			@RequestParam("name") String name,
			@RequestParam("url") String url) {
		bookmarkBO.addBookmark(name, url);
		return "성공";
	}
	
	
	
	@GetMapping("/bookmark-list-view")
	public String bookmarkListView(Model model) {
		List<Bookmark> bookmark = bookmarkBO.getBookmark();
		model.addAttribute("bookmarklist", bookmark);
		
		return "lesson06/bookmarkListView";
	}
}
