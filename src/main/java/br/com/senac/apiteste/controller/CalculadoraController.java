package br.com.senac.apiteste.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/calculadora"})
public class CalculadoraController {

    @PostMapping(path = {"/soma"})
    public int soma(@RequestParam int a, @RequestParam int b){
        int resultado = a + b;

        return resultado;
    }
}
