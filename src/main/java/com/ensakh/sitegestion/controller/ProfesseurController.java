package com.ensakh.sitegestion.controller;

import com.ensakh.sitegestion.service.ProfesseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfesseurController {
    @Autowired
    private ProfesseurService professeurService;

    public ProfesseurController(ProfesseurService professeurService) {
        this.professeurService = professeurService;
    }



    @GetMapping("/professeurs")
    public String listProfesseur(Model model) {
        model.addAttribute("listProfs", professeurService.getAll());
        return "professeurs";
    }
//    @GetMapping("/etudiants/new")
//    public String addEtudiants(Model model) {
//        model
//    }
}