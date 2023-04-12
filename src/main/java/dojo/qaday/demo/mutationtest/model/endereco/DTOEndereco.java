package dojo.qaday.demo.mutationtest.model.endereco;

import jakarta.validation.constraints.NotBlank;

public record DTOEndereco(
        @NotBlank
        String logradouro,
        @NotBlank
        String numero,
        @NotBlank
        String bairro,
        @NotBlank
        String cidade,
        @NotBlank
        String estado,
        @NotBlank
        String cep,

        String complemento) {

}
