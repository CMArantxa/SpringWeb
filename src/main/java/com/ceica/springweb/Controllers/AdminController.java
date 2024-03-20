package com.ceica.springweb.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/admin")
    public String hola(Model model) {
        String nombre = "Arantxa";
        model.addAttribute("name", nombre);
        return "admin";
    }
}
