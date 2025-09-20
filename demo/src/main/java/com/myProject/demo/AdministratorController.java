package com.myProject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdministratorController {

    @Autowired
    private AdministratorRepository administratorRepository;

    @GetMapping("/admin")
    public String getAllAdministrators(Model model) {
        List<Administrator> admins = administratorRepository.findAll();
        model.addAttribute("admins", admins);  // used in Thymeleaf
        return "admin"; // maps to admin.html
    }
}
