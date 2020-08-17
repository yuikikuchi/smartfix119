package com.antelope.smartfix119.domain.repository;

import java.util.List;

import com.antelope.smartfix119.domain.model.NewsListEntity;

public interface NewsListRepository {
	
	List<NewsListEntity> findAll();
}
