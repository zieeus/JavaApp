package com.ensakh.sitegestion.controller;

import com.ensakh.sitegestion.entity.Compte;
import com.ensakh.sitegestion.entity.Element;
import com.ensakh.sitegestion.entity.Professeur;
import com.ensakh.sitegestion.entity.Role;
import com.ensakh.sitegestion.repository.ElementRepository;
import com.ensakh.sitegestion.service.ElementService;
import com.ensakh.sitegestion.service.ProfesseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Controller
public class ElementController {
    @Autowired
    private ElementService elementService;
    @Autowired
    private ProfesseurService professeurService;
    @Autowired
    private ElementRepository elementRepository;

    public ElementController(ElementService elementService) {
        this.elementService = elementService;
    }

    @GetMapping("/elements")
    public String listElements(Model model) {
        model.addAttribute("listElements", elementService.getAll());
        return "elements";
    }
//    @GetMapping("/elements/affectation")
//    public String affectElements(Model model){
//        model.addAttribute("listElements",elementService.getAll());
//    }
//    public String creationCompte(@ModelAttribute("compte") Compte compte, Model model){
//        Compte cpt = compte;
//        Optional<Professeur> professeur = professeurService.getById(compte.getProf().getId());
//        cpt.setProf(professeur.get());
//        Role role = roleRepository.getById(2L);
//        cpt.setRole(role);
//        compteService.save(cpt);
//        model.addAttribute("listComptes",compteService.getAll());
//        return "home";
//    }

}
