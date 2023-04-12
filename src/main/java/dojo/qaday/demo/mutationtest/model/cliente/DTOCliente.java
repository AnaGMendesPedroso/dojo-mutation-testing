package dojo.qaday.demo.mutationtest.model.cliente;

import jakarta.validation.constraints.NotBlank;

public record DTOCliente(
        @NotBlank
        String nomeCliente,
        @NotBlank
        String telefone) {
}
