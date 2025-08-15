package br.com.fiap3espv.spring_boot_project.controller;

import br.com.fiap3espv.spring_boot_project.instrutor.DadosCadastroInstrutor;
import br.com.fiap3espv.spring_boot_project.instrutor.Instrutor;
import br.com.fiap3espv.spring_boot_project.instrutor.InstrutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instrutores")
public class InstrutorController {

    @Autowired
    InstrutorRepository repository;

    @PostMapping
    public void cadastrarInstrutor(@RequestBody DadosCadastroInstrutor dados) {
        repository.save(new Instrutor(dados));
        //System.out.println(dados);
    }
}
