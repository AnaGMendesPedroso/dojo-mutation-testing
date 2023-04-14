package dojo.qaday.demo.mutationtest.model.pedido;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;

@Table(name = "pedidos")
@Entity(name = "Pedido")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class EntityPedido {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String nomeFantasiaVendedor;
    private  String telefoneVendedor;
    private  String enderecoVendedor;
    private Setor setorVendasVendedor;
    private  String nomeCliente;
    private  String telefoneCliente;
    private double valorTotal;

    @Embedded
    private ItemPedido itensPedido;


    public EntityPedido(DTOPedido dados){
        this.nomeFantasiaVendedor = dados.nomeFantasiaVendedor();
        this.telefoneVendedor = dados.telefoneVendedor();
        this.enderecoVendedor = dados.enderecoVendedor();
        this.nomeCliente = dados.nomeCliente();
        this.valorTotal = dados.valorTotal();
        this.setorVendasVendedor = dados.setorVendasVendedor();
        this.itensPedido  = new ItemPedido(dados.itemPedido());
    }
}
