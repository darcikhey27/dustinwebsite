package com.dd.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private static final String HOME_VIEW = "home";
    private static final String ABOUT_VIEW = "about";
    private static final String CONTACT_US_VIEW = "contact-us";
    private static final String TEST_VIEW = "test";


    @GetMapping("/")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return HOME_VIEW;
    }

    @GetMapping("/about")
    public String about() {
        return ABOUT_VIEW;
    }

    @GetMapping("/contact")
    public String contactUs() {
        return CONTACT_US_VIEW;
    }

    @GetMapping("/test")
    public String test() {
        return TEST_VIEW;
    }



}