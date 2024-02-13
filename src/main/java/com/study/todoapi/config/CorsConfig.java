package com.study.todoapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//전역 크로스 오리진설정:클라이언트 허용 아이피 설정
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //어떤 요청url을 허용할지
        registry.addMapping("/api/**" ) //모든 /api/~ 대해서 허용
                .allowedOrigins("http://localhost:3000","http://todo-bucket-seon.s3-website.ap-northeast-2.amazonaws.com")
                .allowedMethods("*")//어떤 요청방식을 허용할지
                .allowedHeaders("*") //어떤 헤더를 허용할지
                .allowCredentials(true) //쿠키 전달을 허용할지
                .maxAge(3600)//허용 시간에 대한 캐싱설정

        ;//어떤 클라이언트를 허용할지

    }
}
