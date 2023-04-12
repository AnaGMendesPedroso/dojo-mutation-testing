package dojo.qaday.demo.mutationtest.model.pedido;


import dojo.qaday.demo.mutationtest.model.produto.DTOProduto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record DTOItemPedido(
        @NotNull @Valid
        DTOProduto produto,
        @Min(1)
        int quantidade) {
}