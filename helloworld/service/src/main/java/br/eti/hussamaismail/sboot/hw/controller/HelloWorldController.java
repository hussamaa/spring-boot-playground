package br.eti.hussamaismail.sboot.hw.controller;

import org.springframework.boot.*;
        import org.springframework.boot.autoconfigure.*;
        import org.springframework.stereotype.*;
        import org.springframework.web.bind.annotation.*;

/**
 * This class represents my Hello World
 * using Spring Boot.
 *
 * This example has been based on:
 * http://projects.spring.io/spring-boot/#quick-start
 *
 * Created by Hussama Ismail on 25/08/16.
 */
@Controller
@EnableAutoConfiguration
public class HelloWorldController {

    @RequestMapping("/")
    @ResponseBody
    @SuppressWarnings("unused")
    String initialPage() {
        return "Hello World! I am using Spring Boot! o//";
    }

    public static void main(final String[] args) throws Exception {
        SpringApplication.run(HelloWorldController.class, args);
    }

}
