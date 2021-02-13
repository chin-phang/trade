package com.aaron.kafka.command.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aaron.kafka.api.request.PromotionRequest;
import com.aaron.kafka.broker.message.PromotionMessage;
import com.aaron.kafka.broker.producer.PromotionProducer;

@Component
public class PromotionAction {

	@Autowired
	private PromotionProducer producer;

	public void publishToKafka(PromotionRequest request) {
		var message = new PromotionMessage(request.getPromotionCode());

		producer.publish(message);
	}

}
