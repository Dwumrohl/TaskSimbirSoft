package com.example.TaskSimbirSoft;

import com.example.TaskSimbirSoft.DAO.ClientRepository;
import com.example.TaskSimbirSoft.models.Client;
import com.example.TaskSimbirSoft.service.DefaultEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.List;
import java.util.Random;

@Controller
public class WebController {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    DefaultEmailService emailService;

    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("client",clientRepository.findClientByName("Тест"));
        model.addAttribute("listClient",clientRepository.findAll());
        return "test";
    }

    @GetMapping("/Indicators")
    public String indicators(Model model){
        return "Indicators";
    }

    @GetMapping("/Statement")
    public String statement(Model model){
        return "Statement";
    }

    @PostMapping("/test")
    public String testPost(@ModelAttribute Client client){
        String values = "0123456789";
        Random rndm = new Random();
        char[] password = new char[6];
        for (int i = 0; i < 6; i++)
        {
            password[i] = values.charAt(rndm.nextInt(values.length()));
        }
        try {
            //emailService.sendSimpleEmail(client.getEmail(), "Your OTP", password.toString());
            emailService.sendMimeMessage(client.getEmail(), "Your OTP", password.toString());
        } catch (MailException mailException){}
        return "test";
    }

}
