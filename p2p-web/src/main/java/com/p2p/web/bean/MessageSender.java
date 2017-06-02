package com.p2p.web.bean;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import com.p2p.web.controller.BaseController;

@Component
public class MessageSender extends BaseController {

	// private Logger log = Logger.getLogger(MessageSender.class);

	@Autowired
	private JmsTemplate jmsTemplate;

	private String Queue = "default_queue";

	private String GoldQueue = "gold_queue";

	// private Gson gson = new Gson();

	/**
	 * 用户登录消息
	 */
	public void userLogin(String username, int type) {
		// Map<String, Object> map = new HashMap<String, Object>();
		// map.put("userid", id);
		// map.put("username", username);

		// System.out.println("发送了一条消息。");
		// 发送到金币队列
		sendMessage("给" + username + "发送一条消息", type);
	}

	/**
	 * 发送到消息队列
	 * 
	 * @param messgae
	 * @param type
	 *            类型，0:默认队列 1：金币队列 ...
	 */
	public void sendMessage(final String messgae, int type) {
		try {
			String destination = this.Queue;
			if (type == 1) {
				destination = GoldQueue;
			}
			jmsTemplate.send(destination, new MessageCreator() {

				@Override
				public Message createMessage(Session arg0) throws JMSException {
					TextMessage textMessage = arg0.createTextMessage(messgae);
					return textMessage;
				}
			});
		} catch (Exception e) {
			logger.error("错误消息：", e);
		}
	}
}
