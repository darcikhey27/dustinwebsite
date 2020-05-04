package com.dd.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /*
     * Names for our views
     */
    private static final String HOME_VIEW = "home-view";
    private static final String FLOORS_VIEW = "floors-view";
    private static final String CONTACT_VIEW = "contact-view";
    private static final String ESTIMATE_VIEW = "estimate-view";
    private static final String CARPET_UPHOLESTERY_VIEW = "carpet_upholestery-view";


    @GetMapping("/")
    public String home() {
        return HOME_VIEW;
    }

    @GetMapping("/floors")
    public String about() {
        return FLOORS_VIEW;
    }

    @GetMapping("/contact")
    public String contactUs() {
        return CONTACT_VIEW;
    }

    @GetMapping("/carpetup")
    public String carpet() {
        return CARPET_UPHOLESTERY_VIEW;
    }

    @GetMapping("/estimate")
    public String test() {
        return ESTIMATE_VIEW;
    }



}