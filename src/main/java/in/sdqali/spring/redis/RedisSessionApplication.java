package in.sdqali.spring.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration;

@SpringBootApplication(exclude = {SessionAutoConfiguration.class
})
public class RedisSessionApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisSessionApplication.class, args);
	}
}
