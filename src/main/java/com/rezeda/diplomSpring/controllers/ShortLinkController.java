package com.rezeda.diplomSpring.controllers;

import com.rezeda.diplomSpring.models.ShortLink;
import com.rezeda.diplomSpring.repos.ShortLinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ShortLinkController {

    @Autowired
    private ShortLinkRepository shortLinkRepository;

    @PostMapping ("/")
    public String shortLink(@RequestParam String long_link, @RequestParam String smallLink){
        if(shortLinkRepository.findBySmallLink(smallLink)!=null){
            System.out.println("ok");
            return "redirect:/?error=smallLink";
        }
        ShortLink shortLink = new ShortLink(long_link, smallLink);
        shortLinkRepository.save(shortLink);
        return "redirect:/";
    }



}
