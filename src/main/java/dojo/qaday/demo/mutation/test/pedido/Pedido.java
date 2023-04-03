package dojo.qaday.demo.mutation.test.pedido;

import dojo.qaday.demo.mutation.test.cliente.Cliente;
import dojo.qaday.demo.mutation.test.vendedor.Vendedor;

import java.math.BigDecimal;

public record Pedido(Vendedor vendedor, Cliente cliente, BigDecimal valorTotal, ItemPedido itemPedido) {
}