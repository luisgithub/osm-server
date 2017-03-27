package com.erpsom.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Created by HMO SmartClinic Ninja Development Team on 10/16/16.
 */
@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurationSupport {

    @Bean
    public WebMvcConfigurer corsConfigurer(){
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry){
                registry.addMapping("/**")
                        .allowedHeaders("Accept", "Content-Type", "Origin", "X-Requested-With")
                        .allowedMethods("GET", "PUT", "POST", "OPTIONS");
                        //.exposedHeaders("x-auth-token", "Authorization");
            }
            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                /**
                 * Setup Swagger UI
                 */
                registry.addResourceHandler("swagger-ui.html")
                        .addResourceLocations("classpath:/META-INF/resources/");
                registry.addResourceHandler("/webjars/**")
                        .addResourceLocations("classpath:/META-INF/resources/webjars/");
            }
        };
    }


}
