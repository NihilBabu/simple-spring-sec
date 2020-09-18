package com.example.springsec.controller;

import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.servlet.http.HttpSession;

@RestController
public class controller {

    @GetMapping
    ResponseEntity controller(HttpSession session){

        return ResponseEntity.ok("hlo welcome");
    }
}
