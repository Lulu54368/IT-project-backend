package com.itproject.petshome.config;

import com.itproject.petshome.filter.JwtTokenFilter;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "application")
@Data
public class ApplicationProperties {
    private String allowedOrigins;


    private Integer accessTokenValiditySeconds;

    private String jwtSigningKey;


}