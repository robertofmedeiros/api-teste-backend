package br.com.senac.apiteste.controller;

import br.com.senac.apiteste.model.Pessoa;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/pessoa"})
public class PessoaController {

    @PostMapping(path = {"/", ""})
    public boolean cadastrarPessoa(@RequestBody Pessoa pessoa){
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Documento: " + pessoa.getDocumento());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());

        return true;
    }

    @GetMapping(path = {"/", ""})
    public ResponseEntity<Pessoa> carregarPessoa(){
        Pessoa out = new Pessoa();
        out.setNome("tttt");
        out.setAltura(10.5);
        out.setIdade(10);
        out.setDocumento("ddddddddd");

        return ResponseEntity.ok().body(out);
    }
}
