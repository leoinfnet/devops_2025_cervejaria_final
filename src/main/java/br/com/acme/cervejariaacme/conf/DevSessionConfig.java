package br.com.acme.cervejariaacme.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.session.MapSessionRepository;
import org.springframework.session.SessionRepository;

import java.util.concurrent.ConcurrentHashMap;

@Configuration
@Profile({"default", "dev"})
public class DevSessionConfig {
    @Bean
    public SessionRepository<?> sessionRepository() {
        return new MapSessionRepository(new ConcurrentHashMap<>());
    }
}
