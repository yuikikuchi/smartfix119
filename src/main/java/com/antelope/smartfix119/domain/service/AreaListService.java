package com.antelope.smartfix119.domain.service;

import com.antelope.smartfix119.domain.model.AreaListEntity;

/**
 * エリア情報検索サービス.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
public interface AreaListService {

	/**
	 * エリアの検索
	 * 
	 * @param area 検索条件（エリア名）
	 */
	AreaListEntity searchArea(String area);

}
