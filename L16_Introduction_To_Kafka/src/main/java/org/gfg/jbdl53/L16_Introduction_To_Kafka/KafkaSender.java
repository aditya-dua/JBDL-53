package org.gfg.jbdl53.L16_Introduction_To_Kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	String topic="hello_world";
	
	public void send(String message) {
		kafkaTemplate.send(topic,message);
	}
	
}
