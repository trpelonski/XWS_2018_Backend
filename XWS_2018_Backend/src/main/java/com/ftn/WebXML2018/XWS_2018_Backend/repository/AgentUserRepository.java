package com.ftn.WebXML2018.XWS_2018_Backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ftn.WebXML2018.XWS_2018_Backend.entity.AgentUser;

public interface AgentUserRepository extends JpaRepository<AgentUser, Long> {

	public AgentUser getById(Long id);
	
	public AgentUser getByPmb(String pmb);
	
	public List<AgentUser> getAllByIdIn(List<Long> ids);
}
