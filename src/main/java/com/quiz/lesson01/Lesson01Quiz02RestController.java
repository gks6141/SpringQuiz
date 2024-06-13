package com.quiz.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/quiz02")
@RestController
public class Lesson01Quiz02RestController {
	
	@RequestMapping("/1")
	public List<Map<String,Object>> quiz02_1(){
		List<Map<String,Object>> list = new ArrayList<>();
		Map<String,Object> map = new HashMap<>();
		map.put("rate" , 15);
		map.put("director" , "봉준호");
		map.put("time" , 131);
		map.put("title" , "기생충");
		list.add(map);
		
		Map<String,Object> map1 = new HashMap<>();
		map1.put("rate" , 0);
		map1.put("director" , "로베르토 베니니");
		map1.put("time" , 116);
		map1.put("title" , "인생은 아름다워");
		list.add(map1);
		
		map = new HashMap<>();
		map.put("rate" , 12);
		map.put("director" , "크리스토퍼 놀란");
		map.put("time" , 147);
		map.put("title" , "인셉션");
		list.add(map);
		
		map = new HashMap<>();
		map.put("rate" , 19);
		map.put("director" , "윤종빈");
		map.put("time" , 133);
		map.put("title" , "범죄와의 전쟁: 나쁜놈들 전성시대");
		list.add(map);

		
		return list;
	}
	
	@RequestMapping("2")
	public List<Notice> quiz02_2() {
		
		List<Notice> list = new ArrayList<>();
		Notice notice = new Notice();
		notice.setTitle("안녕하세요 가입이사 드립니다.");
		notice.setUser("marobiana");
		notice.setContent("안녕하세요. 가입햇어요. 앞으로 잘 부탁 드립니다. 활동 열심히 하겠습니다.");
		list.add(notice);
		
		notice = new Notice();
		notice.setTitle("헐 대박");
		notice.setUser("baba");
		notice.setContent("오늘 목요일이었어... 금요일인줄");
		list.add(notice);
		
		notice = new Notice();
		notice.setTitle("오늘 데이트 한 이야기 해드릴게요.");
		notice.setUser("dulumary");
		notice.setContent("...");
		list.add(notice);
		
		return list;
		
	}
	
	@RequestMapping("/3")
	public ResponseEntity<Notice> quiz02_3(){
		Notice notice = new Notice();
		notice.setTitle("안녕하세요 가입이사 드립니다.");
		notice.setUser("marobiana");
		notice.setContent("안녕하세요. 가입햇어요. 앞으로 잘 부탁 드립니다. 활동 열심히 하겠습니다.");
		
		return new ResponseEntity<>(notice, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
