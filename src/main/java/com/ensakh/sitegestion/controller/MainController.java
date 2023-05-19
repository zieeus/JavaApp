package com.ensakh.sitegestion.controller;


import com.ensakh.sitegestion.entity.Element;
import com.ensakh.sitegestion.repository.ElementRepository;
import com.ensakh.sitegestion.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @Autowired
    private ElementRepository elementRepository;
    @Autowired
    private ModuleRepository moduleRepository;

    @GetMapping("/login")
    public String login(Model model){
        return "login";
    }

    @RequestMapping("/")
    public String home(Model model) {
        return "home";
    }
    @RequestMapping("/home")
    public String home1(Model model) {
        return "home";
    }
    @RequestMapping("/home2")
    public String home2(Model model) {
        model.addAttribute("list",moduleRepository.findAll());
        return "home2";
    }
    @GetMapping("/note")
    public String notes(Model model){
        return "saisie notes";
    }



}