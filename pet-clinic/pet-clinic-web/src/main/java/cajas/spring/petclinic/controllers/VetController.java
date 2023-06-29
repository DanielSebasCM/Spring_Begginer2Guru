package cajas.spring.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cajas.spring.petclinic.services.VetService;
import org.springframework.ui.Model;

@RequestMapping("/vets")
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({ "", "/", "/index", "/index.html" })
    public String listvets(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
