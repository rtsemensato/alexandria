package br.fafiman.alexandria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PessoaController {

    @GetMapping("/ola")
    public String digaOla(@RequestParam(name = "name", required = false, defaultValue = "Pessoa") String nome, Model model) {
        model.addAttribute("name", nome);
        return "ola";
    }

}
