package com.antelope.smartfix119.domain.service;

import java.util.List;

import com.antelope.smartfix119.domain.model.MakerListEntity;

public interface MakerListService {
	
	/**
	 * エリアの検索
	 * 
	 * @param makerName(メイカー名)
	 */
	List<MakerListEntity> searchMaker();
	
	List<MakerListEntity> searchMaker(String modelName);

}
