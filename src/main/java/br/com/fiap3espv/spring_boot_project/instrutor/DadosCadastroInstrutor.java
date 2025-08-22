package br.com.fiap3espv.spring_boot_project.instrutor;

import br.com.fiap3espv.spring_boot_project.endereco.DadosEndereco;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroInstrutor (
        @NotNull
        @NotBlank
        String nome,
        @Email
        String email,

        @NotBlank
        @Pattern(regexp="\\d{9,11}")
        String cnh,
        @NotNull
        Especialidade especialidade,

        @Valid
        DadosEndereco endereco
){
}
