package com.HP.CustomerSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HP.CustomerSystem.dao.ctmuserRepository;
import com.HP.CustomerSystem.model.ctmuser;

@Service
public class ctmuserServiceImpl implements ctmuserService {
	@Autowired
    private ctmuserRepository ctmuserRepository;
	@Override
	public Iterable<ctmuser> findAll() {
		return ctmuserRepository.findAll();
	}
	@Override
	public List<ctmuser> findAllByColumn(String username, String password){
		return ctmuserRepository.findAllByColumn(username,password);
	}

}
