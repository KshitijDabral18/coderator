package com.coderator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main entry point for the Coderator Spring Boot application.
 * This class uses the @SpringBootApplication annotation, which is a convenience annotation
 * that adds:
 * - @Configuration: Tags the class as a source of bean definitions for the application context.
 * - @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings,
 * other beans, and various property settings.
 * - @ComponentScan: Tells Spring to look for other components, configurations, and services
 * in the 'com.coderator' package, allowing it to find controllers, services, repositories, etc.
 */
@SpringBootApplication
public class CoderatorApplication {

    /**
     * The main method that starts the Spring Boot application.
     *
     * @param args Command line arguments passed to the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(CoderatorApplication.class, args);
    }

}
