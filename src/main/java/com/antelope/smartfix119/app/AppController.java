package com.antelope.smartfix119.app;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.antelope.smartfix119.app.contact.ContactForm;
import com.antelope.smartfix119.domain.model.ChargeListEntity;
import com.antelope.smartfix119.domain.model.NewsListEntity;
import com.antelope.smartfix119.domain.model.ShopListEntity;
import com.antelope.smartfix119.domain.service.ChargeListService;
import com.antelope.smartfix119.domain.service.NewsListService;
import com.antelope.smartfix119.domain.service.ShopListService;

@Controller
@RequestMapping("/")
@Mapper
public class AppController {

	@Inject
	NewsListService newsListService;
	
	@Inject
	ChargeListService chargeListService;
	
	@Inject
	ShopListService shopListService;

	@GetMapping("")
	public String top(Model model) {
		List<NewsListEntity> newsList = newsListService.findAll();
		List<ChargeListEntity> chargeList = chargeListService.searchCharge("464");
		List<ShopListEntity> shopList = shopListService.findByPickupShop();
		model.addAttribute("newsList", newsList);
		model.addAttribute("chargeList", chargeList);
		model.addAttribute("shopList", shopList);
		model.addAttribute("contactForm", new ContactForm());
		return "top";
	}
	
}