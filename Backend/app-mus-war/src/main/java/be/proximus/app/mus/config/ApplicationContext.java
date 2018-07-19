package be.proximus.app.mus.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan(basePackages = {
        "be.proximus.app.mus.*"
    })
public class ApplicationContext {
	
	private static final Logger LOG = LoggerFactory.getLogger(ApplicationContext.class);

    @Bean(name = "plainRestTemplate")
    public RestTemplate plainRestTemplate() {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(2000);   // 5 secs
        requestFactory.setReadTimeout(2000);      // 5 secs
        return new RestTemplate(requestFactory);
    }
    
    public Jackson2ObjectMapperBuilder objectMapperBuilder(){
    	Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
    	return builder;
    }
}
