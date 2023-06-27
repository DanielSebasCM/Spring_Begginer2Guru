package cajas.joke.jokeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cajas.joke.jokeapp.services.JokerService;

@Controller
public class JokeController {

    private final JokerService jokerService;

    public JokeController(JokerService jokerService) {
        this.jokerService = jokerService;
    }

    @RequestMapping({ "/", "" })
    public String showJoke(Model model) {
        model.addAttribute("joke", jokerService.getJoke());

        return "index";
    }

}
