package dojo.qaday.demo.mutationtest.model.pedido;

import dojo.qaday.demo.mutationtest.model.endereco.Endereco;
import dojo.qaday.demo.mutationtest.model.vendedor.Setor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Table(name = "pedidos")
@Entity(name = "Pedido")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class EntityPedido {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCliente;
    private String telefoneCliente;

    private String nomeVendedor;
    private String telefoneVendedor;
    private Setor setorVendedor;

    @Embedded
    private Endereco endereco;

    private BigDecimal valorTotal;

    @Embedded
    private ItemPedido itemPedido;

    public EntityPedido(DTOPedido dados){
        this.nomeCliente = dados.cliente().nomeCliente();
        this.telefoneCliente = dados.cliente().telefone();
        this.nomeVendedor = dados.vendedor().nomeFantasia();
        this.telefoneVendedor = dados.vendedor().telefone();
        this.setorVendedor = dados.vendedor().setor();
        this.endereco = new Endereco(dados.vendedor().endereco());
        this.valorTotal = dados.valorTotal();
        this.itemPedido = new ItemPedido(dados.itemPedido());
    }
}
