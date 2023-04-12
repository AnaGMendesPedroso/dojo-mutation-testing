package dojo.qaday.demo.mutationtest.model.pedido;

import dojo.qaday.demo.mutationtest.model.cliente.DTOCliente;
import dojo.qaday.demo.mutationtest.model.vendedor.DTOVendedor;
import jakarta.validation.Valid;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record DTOPedido(
        @NotNull @Valid
        DTOVendedor vendedor,
        @NotNull @Valid
        DTOCliente cliente,
        @DecimalMin(value = "50.0")
        BigDecimal valorTotal,
        @NotNull @Valid
        DTOItemPedido itemPedido) {
}