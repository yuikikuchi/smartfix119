package com.antelope.smartfix119.domain.repository;

import java.util.List;

import com.antelope.smartfix119.domain.model.MakerListEntity;

/**
 * メイカー情報リポジトリ.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
public interface MakerListRepository {

	/**
	 * モデル情報を検索
	 */
	List<MakerListEntity> findAll();

	/**
	 * モデル名を元にメイカー、モデル情報を検索
	 * 
	 * @param modelName 検索条件
	 */
	List<MakerListEntity> findByModelName(String modelName);

}
