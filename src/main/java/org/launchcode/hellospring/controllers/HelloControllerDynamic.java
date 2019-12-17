package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloControllerDynamic {

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

    @RequestMapping(value="hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String name, Model model) {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    @GetMapping("hello/{name}")
    public String helloAgain(@PathVariable String name, Model model) {
        String greeting = "Hello " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model) {
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaScript");
        model.addAttribute("names",names);
        return "hello-list";
    }
    // need to change form.html method and action to GET and hello-localized, respectively, for this to work. old stuff
    @GetMapping("hello-localized")
    @ResponseBody
    public String hello(@RequestParam String name, String lang) {
        if (lang.equals("English")) {
            return "Hello, " + name + "!";
        }
        else if (lang.equals("French")) {
            return "Bonjour, " + name + "!";
        }
        else return name + " " + lang;
    }
}
