package br.com.fiap3espv.spring_boot_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthcheck")
public class HealthCheckController {

    @GetMapping
    public String healthCheck(){
        return "Verificação de integridade Spring Boot da turma 3ESPV";
    }
}
