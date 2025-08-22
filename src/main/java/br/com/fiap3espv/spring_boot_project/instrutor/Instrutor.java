package br.com.fiap3espv.spring_boot_project.instrutor;

import br.com.fiap3espv.spring_boot_project.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name="Instrutor")
@Table(name="instrutores")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode(of="id")
public class Instrutor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String email;
    String cnh;

    @Enumerated(EnumType.STRING)
    Especialidade especialidade;

    @Embedded
    Endereco endereco;

    public Instrutor(DadosCadastroInstrutor dados){
        @Id
        @GeneratedValue()
        this.nome = dados.nome();
        this.email = dados.email();
        this.cnh = dados.cnh();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
    }
}
