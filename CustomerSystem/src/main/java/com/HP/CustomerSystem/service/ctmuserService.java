package com.HP.CustomerSystem.service;

import java.util.List;

import com.HP.CustomerSystem.model.ctmuser;

public interface ctmuserService {
	
	Iterable<ctmuser> findAll();
	List<ctmuser> findAllByColumn(String username,String password);

}
