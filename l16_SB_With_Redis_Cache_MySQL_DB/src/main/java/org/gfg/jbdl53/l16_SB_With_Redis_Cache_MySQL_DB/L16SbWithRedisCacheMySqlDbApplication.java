package org.gfg.jbdl53.l16_SB_With_Redis_Cache_MySQL_DB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class L16SbWithRedisCacheMySqlDbApplication {
	
	public static void main(String[] args) {
				
		SpringApplication.run(L16SbWithRedisCacheMySqlDbApplication.class, args);
	}
	

}
