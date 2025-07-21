package com.coderator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A simple REST controller to demonstrate that the Spring Boot application is running
 * and can serve web requests.
 *
 * The @RestController annotation marks this class as a REST controller, meaning it
 * handles incoming web requests and returns data directly (rather than view names).
 */
@RestController
public class HelloController {

    /**
     * Handles HTTP GET requests to the "/" path.
     *
     * @return A simple "Hello from Coderator!" string.
     * The @GetMapping annotation maps HTTP GET requests to the specified path.
     */
    @GetMapping("/")
    public String hello() {
        return "Hello from Coderator!";
    }

    /**
     * Handles HTTP GET requests to the "/secure" path.
     * This endpoint will be protected by Spring Security's default login.
     *
     * @return A message indicating a secure endpoint was accessed.
     */
    @GetMapping("/secure")
    public String secureHello() {
        return "Hello from Coderator! This is a secure endpoint.";
    }
}
