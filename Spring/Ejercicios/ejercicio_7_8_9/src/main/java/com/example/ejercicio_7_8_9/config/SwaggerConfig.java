package com.example.ejercicio_7_8_9.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .select()
                .paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.any())
                .build();
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo("Spring Boot Laptops API REST",
                "Descripción corta",
                "1.0",
                "Términos de servicio",
                new Contact("Juan Carlos", "juan.contact.com", "jcarvil@gmail.com"),
                "MIT",
                "https://www.mit.edu/~amini/LICENSE.md",
                Collections.emptyList()
        );
    }
}
