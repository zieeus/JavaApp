package com.ensakh.sitegestion.controller;

import com.ensakh.sitegestion.entity.Compte;
import com.ensakh.sitegestion.entity.Professeur;
import com.ensakh.sitegestion.entity.Role;
import com.ensakh.sitegestion.repository.CompteRepository;
import com.ensakh.sitegestion.repository.ProfesseurRepository;
import com.ensakh.sitegestion.repository.RoleRepository;
import com.ensakh.sitegestion.service.CompteService;
import com.ensakh.sitegestion.service.ProfesseurService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class CompteController {


    @Autowired
    public CompteService compteService;
    @Autowired
    public ProfesseurService professeurService;
    @Autowired
    public RoleRepository roleRepository;
    @Autowired
    private CompteRepository compteRepository;

    public CompteController(CompteService compteService, ProfesseurService professeurService) {
        this.compteService = compteService;
        this.professeurService = professeurService;
    }



    @GetMapping("/comptes/new")
    public String formulaireCreation(Model model){
        Compte compte1 = new Compte();
//        Compte compte2 = new Compte();

        model.addAttribute("compte",compte1);
//        model.addAttribute("compte.id",compte2);
        model.addAttribute("listComptes",compteService.getAll());
        model.addAttribute("profs",professeurService.getAll());

        return "DUsers";
    }
    @GetMapping("/comptes/{id}")
    public String deleteUser(@PathVariable Long id) {
        // Delete the user with the specified ID
        compteService.deleteUser(id);
        return "redirect:/comptes/new";
    }


    @PostMapping("/comptes")
    public String creationCompte(@ModelAttribute("compte") Compte compte,Model model){
        Compte cpt = compte;
        Optional<Professeur> professeur = professeurService.getById(compte.getProf().getId());
        cpt.setProf(professeur.get());
        Role role = roleRepository.getById(2L);
        cpt.setRole(role);
        compteService.save(cpt);
        model.addAttribute("listComptes",compteService.getAll());
        return "DUsers2";
    }

    @GetMapping("/comptes")
    public String listComptes(Model model){
        model.addAttribute("listComptes",compteService.getAll());
        return "DUsers";
    }
}
