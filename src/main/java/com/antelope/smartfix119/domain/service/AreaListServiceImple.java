package com.antelope.smartfix119.domain.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.antelope.smartfix119.domain.model.AreaListEntity;
import com.antelope.smartfix119.domain.repository.AreaListRepository;

/**
 * エリア情報検索サービス.
 * 
 * @author Yui Kikuchi
 * @version 1.0.0
 */
@Service
@Transactional
public class AreaListServiceImple implements AreaListService {

	@Inject
	AreaListRepository areaListRepository;

	/**
	 * エリア情報の検索
	 * 
	 * @param area 検索条件（エリア名）
	 * @return 検索結果の返却
	 */
	@Override
	public AreaListEntity searchArea(String area) {
		AreaListEntity result = areaListRepository.findByArea(area);
		return result;
	}

}
