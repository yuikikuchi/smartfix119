package com.antelope.smartfix119.domain.service;

import com.antelope.smartfix119.domain.model.AreaListEntity;

public interface AreaListService {
	
	/**
	 * エリアの検索
	 * 
	 * @param area(エリア名)
	 */
	AreaListEntity searchArea(String area);

}
