package com.ensakh.sitegestion.controller;

import com.ensakh.sitegestion.service.FiliereService;
import com.ensakh.sitegestion.service.ProfesseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FiliereController {
    @Autowired
    private FiliereService filiereService;

    public FiliereController(FiliereService filiereService) {
        this.filiereService = filiereService;
    }



    @GetMapping("/filieres")
    public String listProfesseur(Model model) {
        model.addAttribute("list", filiereService.getAll());
        return "filieres";
    }
}
