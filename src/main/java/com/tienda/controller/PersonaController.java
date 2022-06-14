/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.controller;

import com.tienda.entity.Persona;
import com.tienda.repository.PaisRepository;
import com.tienda.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Aurelio
 */
@Controller
public class PersonaController {
    
    @Autowired
    private IPersonaService personaService;
    
    @GetMapping("/persona")
    public String index (Model model){
      List<Persona> listaPersona = personaService.getAllPersona();
      model.addAttribute("titulo","Tabla Personas");
      model.addAttribute("personas",listaPersona);
      return "personas";
    }
}
