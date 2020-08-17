package com.antelope.smartfix119.domain.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.antelope.smartfix119.domain.model.AreaListEntity;
import com.antelope.smartfix119.domain.repository.AreaListRepository;

@Service
@Transactional
public class AreaListServiceImple implements AreaListService {

	@Inject
	AreaListRepository areaListRepository;
	
	/**
	 * エリア情報の検索
	 * 
	 * @param area(エリア)
	 */
	@Override
	public AreaListEntity searchArea(String area) {
		AreaListEntity result = areaListRepository.findByArea(area);
		return result;
	}

}
