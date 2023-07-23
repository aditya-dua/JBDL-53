package org.gfg.jbdl53.L16_Introduction_To_Kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TopicListener {

	private String topicName="hello_world";
	
	@KafkaListener(topics = "hello_world", groupId="group_id")
	public void consume(ConsumerRecord<String, String> payload) {
		System.out.println("Topic Name:"+payload.topic());
		System.out.println("Key Name:"+payload.key());
		System.out.println("Value Name:"+payload.value());
		System.out.println("Value Name:"+payload.toString());

	}
}
