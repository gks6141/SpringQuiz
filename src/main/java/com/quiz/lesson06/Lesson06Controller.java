package com.quiz.lesson06;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public Map<String, Object> addBookmark(
			@RequestParam("name") String name,
			@RequestParam("url") String url) {
		
		// DB insert
		bookmarkBO.addBookmark(name, url);
		
		// 성공 JSON
		//{"code":200, "result":"성공"}
		Map<String , Object> result = new HashMap<>();
		result.put("code",200);
		result.put("result","성공");
		return result;
	}
	
	
	
	@GetMapping("/bookmark-list-view")
	public String bookmarkListView(Model model) {
		
		//DB select
		List<Bookmark> bookmark = bookmarkBO.getBookmark();
		// model 담기
		model.addAttribute("bookmarklist", bookmark);
		
		return "lesson06/bookmarkListView";
	}
	
	//AJAX 응답
	@ResponseBody
	@GetMapping("/url-is-duplication")
	public Map<String , Object> urlisDuplication(
			@RequestParam("url") String url) {
		Map<String , Object> result = new HashMap<>();
		
		result.put("code", 200);
		result.put("isDuplication", bookmarkBO.isDuplication(url));
		
		return result;
	}
	
	//AJAX 응답
	@ResponseBody
	@PostMapping("/bookmark-delete")
	public Map<String , Object> bookmarkDelete(
			@RequestParam("id") int id) {
		Map<String , Object> deleteResult = new HashMap<>();
		deleteResult.put("code", 200);
		deleteResult.put("bookmarkDelete", bookmarkBO.deleteBookmark(id));
		
		return deleteResult;
	}
	
	
}
