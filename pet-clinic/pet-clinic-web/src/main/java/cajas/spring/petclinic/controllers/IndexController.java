package cajas.spring.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({ "", "/", "index", "index.html" })
    public String index(Model model) {
        model.addAttribute("content", "TESTING MODELSSS");
        return "index";
    }
}
