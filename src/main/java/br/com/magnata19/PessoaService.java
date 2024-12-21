package br.com.magnata19;

public class PessoaService {

    public PessoaDTO list() {
        Pessoa pessoa = new PessoaRepository().List();
        PessoaDTO dto = new PessoaDTO(pessoa.getNome(), pessoa.getCpf());
        return dto;
    }
}
