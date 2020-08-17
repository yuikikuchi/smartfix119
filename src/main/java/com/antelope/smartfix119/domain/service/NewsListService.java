package com.antelope.smartfix119.domain.service;

import java.util.List;

import com.antelope.smartfix119.domain.model.NewsListEntity;

public interface NewsListService {
	
	List<NewsListEntity> findAll();
}
