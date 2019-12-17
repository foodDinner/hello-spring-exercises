//package org.launchcode.hellospring.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//public class HelloController {
//
//    @GetMapping
//    public String helloForm() {
//
//        return "form";
//    }
//
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(@RequestParam String coder, String lang) {
//        if (lang.equals("English")) {
//            return "Hello, " + coder + "!";
//        }
//        else if (lang.equals("French")) {
//            return "Bonjour, " + coder + "!";
//        }
//        else return coder + " " + lang;
//    }
//}
