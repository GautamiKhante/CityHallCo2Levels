package com.partners.allianz.cityhallco2levels;

import com.google.common.base.Predicates;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
@EnableSwagger2
public class CityHallCo2LevelsApplication {
    @Bean
    public Docket demoApi() {
        return new Docket(DocumentationType.SWAGGER_2)// <3>
                .select()// <4>
                .apis(RequestHandlerSelectors.any())// <5>
                .paths(Predicates.not(PathSelectors.regex("/error.*")))// avoid												// basic-error-controll
                .build();
        // http://localhost:8082/swagger-ui.html
    }

    private static void opendeFaultBrowser() {
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI("http://localhost:8082/swagger-ui.html"));
                Desktop.getDesktop().browse(new URI("http://localhost:8082/h2-console"));

            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {

        SpringApplication.run(CityHallCo2LevelsApplication.class, args);

        opendeFaultBrowser();


    }

}
