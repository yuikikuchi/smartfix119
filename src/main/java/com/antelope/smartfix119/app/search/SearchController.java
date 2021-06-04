package com.antelope.smartfix119.app.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.antelope.smartfix119.domain.model.AreaListEntity;
import com.antelope.smartfix119.domain.model.MakerListEntity;
import com.antelope.smartfix119.domain.model.ShopListEntity;
import com.antelope.smartfix119.domain.service.AreaListService;
import com.antelope.smartfix119.domain.service.MakerListService;
import com.antelope.smartfix119.domain.service.ShopListService;

/**
 * 店舗検索用コントローラ.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
@Mapper
@Controller
@RequestMapping("/")
public class SearchController {

	@Autowired
	ResourceLoader resourceLoader;

	@Inject
	AreaListService areaListService;

	@Inject
	ShopListService shopListService;

	@Inject
	MakerListService makerListService;

	/**
	 * 店舗検索ページの描画処理.
	 * 
	 * @param model    ビューのレンダリングに使用する属性
	 * @param area     都道府県情報
	 * @param pageable ページ情報
	 * @param session  リクエストに対するセッション情報
	 * @param request  HTTPサーブレットのリクエスト情報
	 * @return searchの返却
	 */
//	@GetMapping("search")
//	public String searchTest(Model model, @RequestParam(defaultValue = "NOT PARAM") String area,
//			@PageableDefault(page = 0, size = 8) Pageable pageable, HttpSession session, HttpServletRequest request) {
//
//		if (!area.equals("NOT PARAM")) {
//			session.setAttribute("area", area);
//		}
//
//		AreaListEntity areaList = areaListService.searchArea((String) session.getAttribute("area"));
//		Page<ShopListEntity> page = shopListService.searchShopLists(areaList.getArea2No(), pageable);
//		List<MakerListEntity> makerList = makerListService.searchMaker();
//		model.addAttribute("page", page);
//		model.addAttribute("areaList", areaList);
//		model.addAttribute("makerList", makerList);
//
//		// HttpSessionインスタンスの取得（パンくずリスト用）
//		session = request.getSession();
//		session.setAttribute("session", "search");
//		session.setAttribute("areaName", areaList.getArea2Name());
//
//		// Map作成用JSON取得
//		System.out.println("###list" + page.getTotalPages());
//		System.out.println("###list" + page.getPageable().getPageNumber());
//		System.out.println("###list" + areaList.getArea2Name2());
//
////		System.out.println("###list" + list.get(1));
//
//		return "search";
//	}

	/**
	 * 端末情報ページの描画処理.
	 * 
	 * @param model     ビューのレンダリングに使用する属性
	 * @param modelName 端末名
	 * @param session   リクエストに対するセッション情報
	 * @param request   HTTPサーブレットのリクエスト情報
	 * @return model.jspの返却
	 */

	@GetMapping("model")
	public String searchModel(Model model, @RequestParam(defaultValue = "NOT PARAM") String modelName,
			HttpSession session, HttpServletRequest request) {

		if (!modelName.equals("NOT PARAM")) {
			session.setAttribute("modelName", modelName);
		}

		List<MakerListEntity> makerList = makerListService.searchMaker();
		List<MakerListEntity> modelList = makerListService.searchMaker(modelName);
		model.addAttribute("makerList", makerList);
		model.addAttribute("modelList", modelList);

		// HttpSessionインスタンスの取得（パンくずリスト用）
//		session = request.getSession();
//		session.setAttribute("session", "model");

		return "model";
	}

	@GetMapping("search")
	public String search(Model model, @RequestParam(defaultValue = "NOT PARAM") String area,
			@PageableDefault(page = 0, size = 8) Pageable pageable, HttpSession session, HttpServletRequest request) {

		if (!area.equals("NOT PARAM")) {
			session.setAttribute("area", area);
		}

		AreaListEntity areaList = areaListService.searchArea((String) session.getAttribute("area"));
		Page<ShopListEntity> page = shopListService.searchShopLists(areaList.getArea2No(), pageable);
		List<MakerListEntity> makerList = makerListService.searchMaker();
		model.addAttribute("page", page);
		model.addAttribute("areaList", areaList);
		model.addAttribute("makerList", makerList);

		// HttpSessionインスタンスの取得（パンくずリスト用）
		session = request.getSession();
		session.setAttribute("session", "search");
		session.setAttribute("areaName", areaList.getArea2Name());

		// JSONファイル名
		StringBuilder sb = new StringBuilder();
		sb.append(areaList.getArea2No());
		sb.append("_");
		sb.append(areaList.getArea2Name2());
		sb.append("_");
		sb.append(page.getPageable().getPageNumber());
		String jsonFileName = sb.toString();
		session.setAttribute("jsonFileName", jsonFileName);

		return "search";
	}

	@GetMapping("shop")
	public String searchTest(Model model, @RequestParam(defaultValue = "NOT PARAM") int shopId, HttpSession session,
			HttpServletRequest request) {

		System.out.println("Shop search start");
		System.out.println(shopId);

//		if (!shopId.equals("NOT PARAM")) {
//			session.setAttribute("shopId", shopId);
//		}

		ShopListEntity shop = shopListService.findByShopId(shopId);
		List<MakerListEntity> makerList = makerListService.searchMaker();
		model.addAttribute("shop", shop);
		model.addAttribute("makerList", makerList);

		// HttpSessionインスタンスの取得（パンくずリスト用）
//		session = request.getSession();
//		session.setAttribute("session", "search");
//		session.setAttribute("areaName", areaList.getArea2Name());

		return "shop";
	}

	@GetMapping("getJSON")
	@ResponseBody // リターンしたオブジェクトをJSONで解釈できる文字列に自動変換してくれる
	public ResponseEntity getJSON(HttpSession session) throws Exception {

		StringBuilder builder = null;
		String jsonFileName = (String) session.getAttribute("jsonFileName");
		String path = "/json/" + jsonFileName + ".json";
		try (InputStream is = getClass().getResourceAsStream(path);
				BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"))) {

			String str;
			builder = new StringBuilder();
			while ((str = br.readLine()) != null) {
				builder.append(str);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType(MediaType.APPLICATION_JSON, StandardCharsets.UTF_8));
		return new ResponseEntity<>(builder.toString(), headers, HttpStatus.OK);
	}

}
