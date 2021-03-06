package com.ftn.WebXML2018.XWS_2018_Backend.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ftn.WebXML2018.XWS_2018_Backend.entity.Country;

public interface CountryService {

	public Country getOne(Long id);
	
	public List<Country> getAll();
	
	public Page<Country> findByNameLike(String name, Pageable pageable);
	
}
