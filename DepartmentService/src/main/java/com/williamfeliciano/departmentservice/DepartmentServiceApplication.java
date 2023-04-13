package com.williamfeliciano.departmentservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@OpenAPIDefinition(
        info=@Info(
        title = "Department Service REST API",
        description = "Department Service REST API Documentation",
        version = "v1.0",
        contact = @Contact(
                name = "William",
                email = "william.feliciano2@gmail.com",
                url = "http://william.feliciano.com"
        ),
        license = @License(
                name = "Apache License, Version 2.0",
                url = "http://william.feliciano.com"
        )
),
        externalDocs = @ExternalDocumentation(
                description = "Department Service documentation",
                url="http://william.feliciano.com"
        )
)
@SpringBootApplication
public class DepartmentServiceApplication {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(DepartmentServiceApplication.class, args);
    }

}
