package com.example.springsec.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@EnableWebMvc
@Configuration
public class mvc implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {


        registry
                .addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/") // Default Static Loaction
                .setCachePeriod(3600)
                .resourceChain(true);

        registry
                .addResourceHandler("/templates/**") // « /templates/style.css
                .addResourceLocations("classpath:/templates/static/");
        registry
                .addResourceHandler("/webapp/**") // « /webapp/css/style.css
                .addResourceLocations("/");
    }

}
