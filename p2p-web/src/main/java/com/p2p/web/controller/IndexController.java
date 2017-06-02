package com.p2p.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController extends BaseController {

	@RequestMapping("index")
	public String index(HttpServletRequest request, HttpServletResponse response) {
		logger.info("index页面开始");
		return "index";
	}
}
