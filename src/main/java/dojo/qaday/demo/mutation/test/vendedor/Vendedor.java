package dojo.qaday.demo.mutation.test.vendedor;

import dojo.qaday.demo.mutation.test.endereco.Endereco;

public record Vendedor(String nome, Setor setor, String telefone, Endereco endereco) {

}
