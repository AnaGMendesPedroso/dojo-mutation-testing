package dojo.qaday.demo.mutation.test.pedido;


import dojo.qaday.demo.mutation.test.produto.Produto;

public record ItemPedido(Produto produto, int quantidade) {
}