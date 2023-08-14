package br.com.senac.apiteste.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/calculadora"})
public class CalculadoraController {

    @GetMapping(path = {"/soma"})
    public int soma(@RequestParam int a, @RequestParam int b){
        int resultado = a + b;

        return resultado;
    }
}
