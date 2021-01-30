package com.antelope.smartfix119.domain.service;

import java.util.List;

import com.antelope.smartfix119.domain.model.MakerListEntity;

/**
 * 端末情報検索サービス.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
public interface MakerListService {

	/**
	 * 端末情報の検索
	 */
	List<MakerListEntity> searchMaker();

	/**
	 * 端末情報の検索
	 * 
	 * @param modelName 検索条件（モデル名）
	 */
	List<MakerListEntity> searchMaker(String modelName);

}
