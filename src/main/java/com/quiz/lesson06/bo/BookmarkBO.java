package com.quiz.lesson06.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson06.domain.Bookmark;
import com.quiz.lesson06.mapper.BookmarkMapper;

@Service
public class BookmarkBO {
	@Autowired
	private BookmarkMapper bookmarkMapper;
	
	public void addBookmark(String name, String url) {
		bookmarkMapper.insertBookmark(name, url);
	}
	
	public List<Bookmark> getBookmark(){
		return bookmarkMapper.selectBookmark();
	}
	
	public boolean isDuplication(String url) {
		return bookmarkMapper.isDuplication(url);
	}
	
	public boolean deleteBookmark(int id) {
		return bookmarkMapper.deleteBookmark(id);
	}
}
