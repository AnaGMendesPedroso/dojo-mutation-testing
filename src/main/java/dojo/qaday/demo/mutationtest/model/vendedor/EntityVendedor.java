package dojo.qaday.demo.mutationtest.model.vendedor;

import dojo.qaday.demo.mutationtest.model.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "vendedores")
@Entity(name = "Vendedor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class EntityVendedor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeFantasia;

    private String telefone;

    @Enumerated(EnumType.STRING)
    private Setor setor;

    @Embedded
    private Endereco endereco;

    public EntityVendedor(DTOVendedor dados) {
        this.nomeFantasia = dados.nomeFantasia();
        this.telefone = dados.telefone();
        this.setor = dados.setor();
        this.endereco = new Endereco(dados.endereco());
    }
}
