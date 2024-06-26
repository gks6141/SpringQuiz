package com.quiz.weather_history;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.weather_history.bo.WeatherHistoryBO;
import com.quiz.weather_history.domain.WeatherHistory;

@Controller
@RequestMapping("/weather-history")
public class WeatherHistoryController {
	@Autowired
	private WeatherHistoryBO weatherHistoryBO;
	
	@GetMapping("/weather-list-view")
	public String weatherView(Model model) {
		//selectDB
		List<WeatherHistory> Weather= weatherHistoryBO.getWeatherHistory();
		
		//model담기
		model.addAttribute("weathers", Weather);
		return "weather_history/weatherList";
	}
	
	@GetMapping("/add-weather-view")
	public String addWeatherView() {
		return "weather_history/addWeather";
	}
	
	//날씨 추가 기능
	//@DateTimeFormat() annotation
	//@RequestParam("startDate") @DateTimeFormat(iso = ISO.DATE_TIME) LocalDate startDate 
	//@RequestParam("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate
//	@RequestParam("date") localDate date;
//	@RequestParam("weather")
//	@RequestParam("microDust")	
//	@RequestParam("temperatures")
//	@RequestParam("precipitation")
//	@RequestParam("windSpeed")
	
	@PostMapping("/add-weather")
	public String addWeather(WeatherHistory weatherHistory) {
		//db insert
		weatherHistoryBO.addWeatherHistory(weatherHistory);
		//redirect => 날씨 목록
		return "redirect:/weather-history/weather-list-view";
	}
	
}
