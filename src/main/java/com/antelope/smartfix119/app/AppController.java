package com.antelope.smartfix119.app;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.antelope.smartfix119.app.contact.ContactForm;
import com.antelope.smartfix119.domain.model.ChargeListEntity;
import com.antelope.smartfix119.domain.model.MakerListEntity;
import com.antelope.smartfix119.domain.model.NewsListEntity;
import com.antelope.smartfix119.domain.model.ShopListEntity;
import com.antelope.smartfix119.domain.service.ChargeListService;
import com.antelope.smartfix119.domain.service.MakerListService;
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
	
	@Inject
	MakerListService makerListService;

	@GetMapping("")
	public String top(Model model, HttpSession session, HttpServletRequest request) {
		List<NewsListEntity> newsList = newsListService.findAll();
		List<ChargeListEntity> chargeList = chargeListService.searchCharge("464");
		List<ShopListEntity> shopList = shopListService.findByPickupShop();
		List<MakerListEntity> makerList = makerListService.searchMaker();
		model.addAttribute("newsList", newsList);
		model.addAttribute("chargeList", chargeList);
		model.addAttribute("shopList", shopList);
		model.addAttribute("contactForm", new ContactForm());
		model.addAttribute("makerList", makerList);
		
		// HttpSessionインスタンスの取得（パンくずリスト用）
		session = request.getSession();
		session.setAttribute("session", "top");

		return "top";
	}
	
//	@GetMapping("model")
//	public String model(Model model) {
//		return "model";
//	}
	
}