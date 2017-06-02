package com.p2p.web.bean;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import com.p2p.web.controller.BaseController;

public class ConsumerMessageListener3 extends BaseController implements MessageListener {

	@Override
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		TextMessage textmessage = (TextMessage) message;
		try {
			logger.info(Thread.currentThread().getStackTrace()[1].getMethodName() + "接收消息：" + textmessage.getText());
			message.acknowledge();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
