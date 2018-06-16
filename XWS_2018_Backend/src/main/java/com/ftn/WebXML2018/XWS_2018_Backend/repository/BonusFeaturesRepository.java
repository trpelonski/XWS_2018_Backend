package com.ftn.WebXML2018.XWS_2018_Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ftn.WebXML2018.XWS_2018_Backend.entity.BonusFeatures;

public interface BonusFeaturesRepository extends JpaRepository<BonusFeatures, Long>{

	public BonusFeatures getByName(String name);
}
