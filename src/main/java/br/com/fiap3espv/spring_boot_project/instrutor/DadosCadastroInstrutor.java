package br.com.fiap3espv.spring_boot_project.instrutor;

public record DadosCadastroInstrutor (
        String nome,
        String email,
        String cnh,
        Especialidade especialidade
){
}
