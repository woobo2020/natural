package com.escape.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("/contracts")
@Controller
public class ContractController {

	@RequestMapping("contract.do")
	public ModelAndView home(HttpServletRequest request, HttpServletResponse response){
		final ModelAndView mav = new ModelAndView("home");
		System.out.println("########## home ###############");
		mav.addObject("serverTime",new Date());
		return mav;
	}
	
}
