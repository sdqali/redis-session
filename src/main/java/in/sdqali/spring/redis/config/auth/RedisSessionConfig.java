package in.sdqali.spring.redis.config.auth;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
@ConditionalOnProperty(name = "use.redis.session.store", havingValue = "true")
@EnableRedisHttpSession
public class RedisSessionConfig {
}
