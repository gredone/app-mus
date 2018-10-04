package be.proximus.app.mus.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.web.client.RestTemplate;

import com.google.common.util.concurrent.RateLimiter;

@Configuration
@ComponentScan(basePackages={"be.proximus.app.mus.*"})
@EntityScan("be.proximus.app.mus.entity") 
public class ApplicationContext {
	
	private static final Logger LOG = LoggerFactory.getLogger(ApplicationContext.class);
	private static final int REQUESTS_PER_SECOND = 7; 

    @Bean(name = "plainRestTemplate")
    public RestTemplate plainRestTemplate() {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(2000);   // 2 secs
        requestFactory.setReadTimeout(2000);      // 2 secs
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        return restTemplate;
    }    
    
    @Bean
    public Jackson2ObjectMapperBuilder objectMapperBuilder(){
    	Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
    	return builder;
    }
    
    @Bean
    public RateLimiter plainRateLimiter(){
    	RateLimiter rateLimiter = RateLimiter.create(REQUESTS_PER_SECOND);
    	return rateLimiter;
    }
    
}
