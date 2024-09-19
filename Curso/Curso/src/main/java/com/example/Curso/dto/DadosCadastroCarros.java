package com.example.Curso.dto;

import com.example.Curso.dto.carros.Combustivel;
import com.example.Curso.dto.carros.Estado_do_carro;
import com.example.Curso.dto.carros.Marca;

public record DadosCadastroCarros(

        String modelo,
        Marca marca,
        String ano,
        String cor,
        Integer km,
        Combustivel combustivel,
        Estado_do_carro estado) {
}
