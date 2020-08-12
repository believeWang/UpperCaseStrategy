package com.robertwang.upperCaseStrategy.config;

import java.util.List;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {


  @Override
  public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
    converters
        .stream()
        .filter(MappingJackson2HttpMessageConverter.class::isInstance)
        .forEach(converter -> {
          ((MappingJackson2HttpMessageConverter) converter).getObjectMapper().setPropertyNamingStrategy(new UpperCaseStrategy());
        });
  }

}
