package br.com.fiap3espv.spring_boot_project.endereco;

public record DadosEndereco(String logradouro,
                            String numero,
                            String bairro,
                            String cidade,
                            String complemento,
                            String uf,
                            String cep) {

}


