package dojo.qaday.demo.mutationtest.model.pedido;


import dojo.qaday.demo.mutationtest.model.produto.DTOProduto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record DTOItemPedido(
        @NotNull @Valid
        DTOProduto produto,
        @Min(value= 1, message = "Ao menos 1 unidade do produto deve ser adicionada.")
        int quantidade) {

        public DTOItemPedido(ItemPedido itemPedido) {
                this(new DTOProduto(itemPedido.getProduto()),itemPedido.getQuantidade());
        }
}