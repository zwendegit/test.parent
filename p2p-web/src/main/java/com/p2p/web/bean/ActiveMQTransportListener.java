package com.p2p.web.bean;

import java.io.IOException;

import org.apache.activemq.transport.TransportListener;

import com.p2p.web.controller.BaseController;

public class ActiveMQTransportListener extends BaseController implements TransportListener {

	@Override
	public void onCommand(Object arg0) {
		// TODO Auto-generated method stub
		logger.info("onException -> 消息服务器连接错误......" + arg0.toString());
	}

	@Override
	public void onException(IOException arg0) {
		// TODO Auto-generated method stub
		logger.error("onException -> 消息服务器连接错误......" + arg0.getStackTrace());
	}

	@Override
	public void transportInterupted() {
		// TODO Auto-generated method stub
		logger.error("消息服务器连接发生中断.........");
	}

	@Override
	public void transportResumed() {
		// TODO Auto-generated method stub
		logger.error("transportResumed -> 消息服务器连接已恢复.........");
	}

}
