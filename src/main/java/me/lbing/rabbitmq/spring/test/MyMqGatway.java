package me.lbing.rabbitmq.spring.test;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class MyMqGatway {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	public void sendDataToCrQueue(Object obj) {
		amqpTemplate.convertAndSend("queue_one_key", obj);
	}	
}
