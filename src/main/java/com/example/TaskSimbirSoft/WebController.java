package com.example.TaskSimbirSoft;

import com.example.TaskSimbirSoft.DAO.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.List;

@Controller
public class WebController {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("client",clientRepository.findClientByName("Тест"));
        model.addAttribute("listClient",clientRepository.findAll());
        return "test";
    }
}
