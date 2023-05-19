package com.ensakh.sitegestion.controller;

import com.ensakh.sitegestion.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ModuleController {

    @Autowired
    private ModuleService moduleService;

    public ModuleController(ModuleService moduleService){
        this.moduleService = moduleService;
    }

    @GetMapping("/modules")
    public String listModule(Model model) {
        model.addAttribute("listModules", moduleService.getAll());
        return "modules";
    }

}
