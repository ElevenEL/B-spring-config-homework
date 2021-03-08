package com.thoughtworks.capability.gtb.demospringconfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@Data
@ConfigurationProperties(value = "mail")
public class MailConfig {

    private String hostname;

    private int port;

    private String from;

    private List<String> defaultRecipients;

    private Map<String, Boolean> additionalHeaders;

    private Credentials credentials;


}
