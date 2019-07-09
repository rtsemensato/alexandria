package br.fafiman.alexandria.service;

import br.fafiman.alexandria.model.Pessoa;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class PessoaService {

    private static String template = "Olá, %s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/pessoa")
    public Pessoa getPessoa(@RequestParam(value = "name", defaultValue = "Pessoa") String name) {
        return new Pessoa(counter.incrementAndGet(), String.format(template, name));
    }

}
