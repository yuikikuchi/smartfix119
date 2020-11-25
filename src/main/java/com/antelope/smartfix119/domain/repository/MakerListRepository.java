package com.antelope.smartfix119.domain.repository;

import java.util.List;

import com.antelope.smartfix119.domain.model.MakerListEntity;

public interface MakerListRepository {

	/**
	 * メイカー名を元にメイカー、モデルを検索
	 * 
	 * @param makerName 検索条件
	 */
	List<MakerListEntity> findAll();
	
	List<MakerListEntity> findByModelName(String modelName);

}
