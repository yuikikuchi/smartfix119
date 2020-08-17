package com.antelope.smartfix119.app;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.antelope.smartfix119.app.contact.ContactForm;
import com.antelope.smartfix119.domain.model.NewsListEntity;
import com.antelope.smartfix119.domain.service.NewsListService;

@Controller
@RequestMapping("/")
@Mapper
public class AppController {

	@Inject
	NewsListService newsListService;

	@GetMapping("")
	public String top(Model model) {
		List<NewsListEntity> newsList = newsListService.findAll();
		model.addAttribute("newsList", newsList);
		model.addAttribute("contactForm", new ContactForm());
		return "top";
	}
	
}