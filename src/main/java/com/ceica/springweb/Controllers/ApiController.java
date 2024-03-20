package com.ceica.springweb.Controllers;


import com.ceica.springweb.Alumno;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/*Cada decorador es una funcion. En localhost vas añadiendo los endpoints.

 */
@RestController
@RequestMapping("/api")
public class ApiController {
    @GetMapping("/pedirdatos")
    public List<String> prueba(){
        List<String> datos=new ArrayList<>();
        datos.add("hola mundo");
        datos.add("que pasa");
        return datos;
    }


    @PostMapping("/alumno")
    public Alumno crearAlumno(@RequestBody Alumno alumno){
        System.out.println(alumno.toString());
alumno.setNombre("alumno cambiado");
        return alumno;
    }



}
