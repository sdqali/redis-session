package in.sdqali.spring.redis.config.auth;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.MapSessionRepository;
import org.springframework.session.SessionRepository;
import org.springframework.session.config.annotation.web.http.EnableSpringHttpSession;

@Configuration
@ConditionalOnProperty(name = "use.redis.session.store", havingValue = "false", matchIfMissing = true)
@EnableSpringHttpSession
public class MapSessionConfig {
  @Bean
  public SessionRepository sessionRepository() {
    return new MapSessionRepository();
  }
}
