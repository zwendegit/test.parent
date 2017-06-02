package com.p2p.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.p2p.web.bean.MessageSender;

@Controller
public class ActivemqController extends BaseController {

	@Autowired
	private MessageSender messageSender;

	@RequestMapping("activemq/{username}/{type}")
	public String sendMessage(@PathVariable String username, @PathVariable int type) {
		messageSender.userLogin(username, type);
		logger.info(getTime() + "发送消息");
		return "index";
	}

	public static String getTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date());
	}
}
