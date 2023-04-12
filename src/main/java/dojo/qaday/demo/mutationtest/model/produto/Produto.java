package dojo.qaday.demo.mutationtest.model.produto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    private String nomeProduto;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    @Enumerated(EnumType.STRING)
    private Fornecedor fornecedor;

    private BigDecimal preco;

    public Produto(DTOProduto produto) {
        this.nomeProduto = produto.nomeProduto();
        this.categoria = produto.categoria();
        this.fornecedor = produto.fornecedor();
        this.preco = produto.precoUnitario();
    }
}
