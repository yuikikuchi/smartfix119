package com.antelope.smartfix119.domain.repository;

import com.antelope.smartfix119.domain.model.AreaListEntity;

public interface AreaListRepository {

	/**
	 * エリア名を元にエリア情報を検索処理
	 * 
	 * @param area 検索条件
	 */
	AreaListEntity findByArea(String area);

}
