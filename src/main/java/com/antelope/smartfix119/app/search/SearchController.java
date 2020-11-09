package com.antelope.smartfix119.app.search;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.antelope.smartfix119.domain.model.AreaListEntity;
import com.antelope.smartfix119.domain.model.ShopListEntity;
import com.antelope.smartfix119.domain.service.AreaListService;
import com.antelope.smartfix119.domain.service.ShopListService;

@Controller
@RequestMapping("/")
@Mapper
public class SearchController {

	@Inject
	AreaListService areaListService;

	@Inject
	ShopListService shopListService;

	/**
	 * 店舗検索
	 * 
	 * @param area
	 * @param model
	 */
	/*
	 * @GetMapping("search") public String search(@RequestParam(defaultValue =
	 * "NOT PARAM") String area, Pageable pageable, Model model) {
	 * 
	 * AreaListEntity areaList = areaListService.searchArea(area);
	 * List<ShopListEntity> shopList = new
	 * ArrayList<>(shopListService.findByAreaNo(areaList.getArea2No())); //
	 * 各店舗をランダム表示 Collections.shuffle(shopList); model.addAttribute("areaList",
	 * areaList); model.addAttribute("shopList", shopList); return "search"; }
	 */

	@GetMapping("search")
	public String searchTest(@RequestParam(defaultValue = "NOT PARAM") String area, @PageableDefault(page = 0, size = 8) Pageable pageable, Model model, HttpSession session) {
		
		if (!area.equals("NOT PARAM")) {
			session.setAttribute("area",area);
		}

		AreaListEntity areaList = areaListService.searchArea((String) session.getAttribute("area"));
		Page<ShopListEntity> page = shopListService.searchShopLists(areaList.getArea2No(), pageable);
		model.addAttribute("page", page);
		model.addAttribute("areaList", areaList);

		return "search";
	}

}
