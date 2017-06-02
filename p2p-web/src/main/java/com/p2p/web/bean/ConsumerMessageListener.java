package com.p2p.web.bean;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import com.p2p.web.controller.BaseController;

public class ConsumerMessageListener extends BaseController implements MessageListener {

	@Override
	public void onMessage(Message arg0) {
		// TODO Auto-generated method stub
		// 监听发送到消息队列的文本消息，作强制转换。
		ObjectMessage textMessage = (ObjectMessage) arg0;
		try {
			// System.out.println("接收消息：" + textMessage.getText());
			logger.info("接收消息：" + textMessage.getObject());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
