package com.antelope.smartfix119.domain.repository;

import com.antelope.smartfix119.domain.model.AreaListEntity;

/**
 * エリア情報リポジトリ.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
public interface AreaListRepository {

	/**
	 * エリア名を元にエリア情報を検索
	 * 
	 * @param area 検索条件
	 */
	AreaListEntity findByArea(String area);

}
