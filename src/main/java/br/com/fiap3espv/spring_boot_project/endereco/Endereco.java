package br.com.fiap3espv.spring_boot_project.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Endereco {
    String logradouro;
    String numero;
    String complemento;
    String bairro;
    String cidade;
    String uf;
    String cep;

    public Endereco(DadosEndereco dados){
        this.logradouro = dados.logradouro();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
        this.bairro = dados.bairro();
        this.uf = dados.uf();
        this.endereco = dados.endereco();
    }
}
