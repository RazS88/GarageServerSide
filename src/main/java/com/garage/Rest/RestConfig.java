package com.garage.Rest;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *  Created by raz samari on 03.11.2019.
 */
@Configuration
public class RestConfig implements WebMvcConfigurer {

	   @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**")
	                .allowedOrigins(
	                        "http://localhost:4200")
	                .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD","OPTION")
	                .allowedHeaders("Access-Control-Allow-Credentials", "HttpHeaders","Content-Type","Accept")
	                .allowCredentials(true);
	    }
}
