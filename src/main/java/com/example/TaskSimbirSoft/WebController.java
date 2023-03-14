package com.example.TaskSimbirSoft;

import com.example.TaskSimbirSoft.DAO.ClientRepository;
import com.example.TaskSimbirSoft.service.EmailServiceImpl;
import com.example.TaskSimbirSoft.Entity.EmailDetails;
import com.example.TaskSimbirSoft.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
public class WebController {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    EmailServiceImpl emailService;

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
        EmailDetails emailDetails = new EmailDetails("sergey.ushakov.2101@gmail.com","пошел нахуй","ххх");
        /*String values = "0123456789";
        Random rndm = new Random();
        char[] password = new char[6];
        for (int i = 0; i < 6; i++)
        {
            password[i] = values.charAt(rndm.nextInt(values.length()));
        }*/
        try {
            emailService.sendSimpleMail(emailDetails);
        } catch (MailException mailException){}
        return "test";
    }

}
