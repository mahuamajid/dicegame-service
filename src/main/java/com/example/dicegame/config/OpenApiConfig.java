package com.example.dicegame.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "openapi.service")
@Getter
@Setter
public class OpenApiConfig {
    private String title;
    private String version;
    private String url;

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .servers(List.of(new Server().url(url)))
                .info(new Info()
                .title(title)
                .description("REST API for the dice game")
                .version(version));
    }
}
