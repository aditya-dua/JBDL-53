package org.gfg.jbdl53.l15_Springboot_With_Redis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@Configuration
@EnableRedisRepositories
public class RedisConfig {
	
	@Bean
	public JedisConnectionFactory connectionFactor() {
		
		RedisStandaloneConfiguration config = new RedisStandaloneConfiguration();
		//config.setPassword("9e9vSaFVGfVL7xWTCv5rWEEnEyTLgO2Y");
		//config.setUsername("default");
		//config.setHostName("redis-16312.c212.ap-south-1-1.ec2.cloud.redislabs.com");
		//config.setPort(16312);
		config.setPort(16312);
		return new JedisConnectionFactory(config);
		
	}
	
	@Bean
	public RedisTemplate<String, Object> template(){
		
		RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
		template.setConnectionFactory(connectionFactor());
		
		return template;
	}
	
	

}
