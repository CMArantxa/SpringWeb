package com.ceica.springweb.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
public class ViewController {
    /* @GetMapping("/index")
     public String index(){
         return "index";
     }*/
    @GetMapping("/index")
    public String welcome(Model model) {
        String nombre = "Arantxa";
        model.addAttribute("name", nombre);
        return "index";
    }

    @PostMapping("/tarea")
    public String crearTarea (@ModelAttribute Tarea tarea) {
        System.out.println(tarea);
        return "index";


        }
    }

