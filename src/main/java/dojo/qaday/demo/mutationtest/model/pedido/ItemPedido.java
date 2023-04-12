package dojo.qaday.demo.mutationtest.model.pedido;

import dojo.qaday.demo.mutationtest.model.produto.Produto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ItemPedido {
    @Embedded
    private Produto produto;
    private int quantidade;

    public ItemPedido(DTOItemPedido itemPedido){
        this.produto = new Produto(itemPedido.produto());
        this.quantidade = itemPedido.quantidade();
    }
}
