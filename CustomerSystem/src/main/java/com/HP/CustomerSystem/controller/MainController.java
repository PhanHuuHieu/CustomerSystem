package com.HP.CustomerSystem.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.HP.CustomerSystem.service.ctmuserServiceImpl;


@Controller
public class MainController {
	@Autowired
	private ctmuserServiceImpl ctmService;
	@GetMapping("/")
	public String home(HttpServletRequest request) {
		return "index";
	}

}
