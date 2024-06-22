package com.rezeda.diplomSpring.controllers;

import com.rezeda.diplomSpring.models.ShortLink;
import com.rezeda.diplomSpring.repos.ShortLinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private ShortLinkRepository shortLinkRepository;

    @GetMapping ()
    public String addLink(@RequestParam (name = "error", defaultValue = "", required = false) String error, Model model){
        Iterable<ShortLink> shortLinks = shortLinkRepository.findAll();
        model.addAttribute("shortLinks", shortLinks);
        if(error.equals("smallLink")){
            model.addAttribute("error", "Такая сокращенная ссылка уже существует. Введите другое сокращение");
        } else {
            model.addAttribute("error", "Готово");
        }
        return "index";
    }


}
