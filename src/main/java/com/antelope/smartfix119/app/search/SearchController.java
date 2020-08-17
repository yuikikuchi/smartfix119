package com.antelope.smartfix119.app.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.annotations.Mapper;
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
	@GetMapping("search")
	public String login(@RequestParam(defaultValue = "NOT PARAM") String area, Model model) {
		AreaListEntity areaList = areaListService.searchArea(area);
		List<ShopListEntity> shopList = new ArrayList<>(shopListService.findByAreaNo(areaList.getArea2No()));
		// 各店舗をランダム表示
		Collections.shuffle(shopList);
		model.addAttribute("areaList", areaList);
		model.addAttribute("shopList", shopList);
		return "search";
	}

}
