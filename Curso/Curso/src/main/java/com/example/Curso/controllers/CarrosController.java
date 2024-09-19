package com.example.Curso.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class CarrosController {

    @PostMapping
    public void cadastrar(@RequestBody com.example.Curso.dto.DadosCadastroCarros dados){

        System.out.println(dados);
    }
}
