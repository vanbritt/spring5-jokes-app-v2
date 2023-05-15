package com.vanbritt.spring5jokesappv2.controllers;

import com.vanbritt.spring5jokesappv2.services.JokeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService){
        this.jokeService =jokeService;
    }
    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", this.jokeService.getJoke());
        return "index";
    }
}
