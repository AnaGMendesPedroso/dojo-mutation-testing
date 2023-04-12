package dojo.qaday.demo.mutationtest.model.vendedor;

import dojo.qaday.demo.mutationtest.model.endereco.DTOEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DTOVendedor(
        @NotBlank
        String nomeFantasia,
        @NotNull
        Setor setor,
        @NotBlank
        String telefone,
        @NotNull @Valid
        DTOEndereco endereco) {

}
