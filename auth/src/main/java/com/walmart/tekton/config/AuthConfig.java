package com.walmart.tekton.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.NotNull;

@Validated
@ConfigurationProperties(value = "tekton-auth")
public class AuthConfig {

    @NotNull private String secretKey;

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}
