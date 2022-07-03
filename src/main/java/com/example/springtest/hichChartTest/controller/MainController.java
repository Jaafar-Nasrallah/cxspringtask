package com.example.springtest.hichChartTest.controller;

import com.example.springtest.hichChartTest.model.UserSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    UserSession userSession = new UserSession("","",false);

    @GetMapping("/")
    public String index() {
        if (this.userSession.IsAuthenticated()) {
            return "dashboard";
        } else {
            return "login";
        }
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        if (this.userSession.IsAuthenticated()) {
            model.addAttribute("pass", 90);
            model.addAttribute("fail", 10);
            return "dashboard";
        } else {
            return "login";
        }
    }

    @GetMapping("/home")
    public String home(Model model) {
        if (this.userSession.IsAuthenticated()) {
            return "home";
        } else {
            return "login";
        }
    }


    @GetMapping("/login")
    public String login(Model model) {
        if (this.userSession.IsAuthenticated()) {
            return "home";
        } else {
            return "login";
        }
    }

    @PostMapping(value = "/login/authenticate", produces="application/json")
    @ResponseBody
    public String handleLogin(@RequestBody UserSession userSession) {
        if (userSession.IsAuthenticated()){
            this.userSession = userSession;
            return "1";
        }
        else {
           return "0";
        }
    }
}
