package br.com.fatec.ativ_ci_inicial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NameController {

    @GetMapping("/name")
    public String name() {
        return "João Vitor Kusaka";
    }

}