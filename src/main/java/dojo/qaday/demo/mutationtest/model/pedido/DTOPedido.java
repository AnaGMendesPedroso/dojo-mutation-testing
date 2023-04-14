package dojo.qaday.demo.mutationtest.model.pedido;

import jakarta.validation.Valid;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DTOPedido(
        @NotBlank
        String nomeFantasiaVendedor,
        @NotNull
        Setor setorVendasVendedor,
        @NotBlank
        String telefoneVendedor,
        @NotBlank
        String enderecoVendedor,
        @NotBlank
        String nomeCliente,

        String telefoneCliente,
        @DecimalMin(value = "50.0", message = "O pedido deve ter um valor total mínimo de R$50,00.")
        double valorTotal,
        @NotNull @Valid
        DTOItemPedido itemPedido) {
}