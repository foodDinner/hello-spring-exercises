package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {

    @GetMapping
    public String helloForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'get' action = '/hello'>" +
                        "<input type = 'text' name = 'coder' />" +
                        "<select name='lang'>" +
                        "<option value='English'>English</option>" +
                        "<option value='French'>French</option>" +
                        "</select>" +
                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @GetMapping("hello")
    public String hello(@RequestParam String coder, String lang) {
        if (lang.equals("English")) {
            return "Hello, " + coder + "!";
        }
        else if (lang.equals("French")) {
            return "Bonjour, " + coder + "!";
        }
        else return coder + " " + lang;
    }
}
