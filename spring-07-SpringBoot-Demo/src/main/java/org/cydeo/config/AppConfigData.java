package org.cydeo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class AppConfigData {

    @Value("${username}")
    private String userName;
    @Value("${password}")
    private String password;
    @Value("${url}")
    private String url;

}
