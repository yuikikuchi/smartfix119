package com.antelope.smartfix119.domain.service;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.antelope.smartfix119.domain.model.MakerListEntity;
import com.antelope.smartfix119.domain.repository.MakerListRepository;

@Service
@Transactional
public class MakerListServiceImple implements MakerListService {

	@Inject
	MakerListRepository makerListRepository;
	
	/**
	 * エリア情報の検索
	 * 
	 * @param makerName(メイカー名)
	 */
	@Override
	public List<MakerListEntity> searchMaker() {
		List<MakerListEntity> result = makerListRepository.findAll();
		return result;
	}
	
	@Override
	public List<MakerListEntity> searchMaker(String modelName) {
		List<MakerListEntity> result = makerListRepository.findByModelName(modelName);
		return result;
	}

}
