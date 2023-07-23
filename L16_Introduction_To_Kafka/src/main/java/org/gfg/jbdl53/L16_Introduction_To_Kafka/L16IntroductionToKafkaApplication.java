package org.gfg.jbdl53.L16_Introduction_To_Kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class L16IntroductionToKafkaApplication {
	@Autowired
	KafkaSender kafkaSender;
	
	public static void main(String[] args) {
		SpringApplication.run(L16IntroductionToKafkaApplication.class, args);
	}
	
	@GetMapping("/producer")
	public String producer(@RequestParam("message") String message) {
		kafkaSender.send(message);
		return "Message has been sent to the kafka topic helloworld";
	}
	
	

}
