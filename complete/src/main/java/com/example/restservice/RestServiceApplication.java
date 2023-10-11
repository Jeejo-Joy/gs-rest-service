package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.Ssl;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestServiceApplication.class, args);
    }

    @Bean
    public TomcatServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.setPort(8080);
        factory.setSsl(getSsl());
        return factory;
    }

    private Ssl getSsl() {
        Ssl ssl = new Ssl();
        ssl.setKeyStore("classpath:truststore.jks");
        ssl.setKeyStorePassword("welcome");
        ssl.setKeyPassword("welcome");
        return ssl;
    }

}
