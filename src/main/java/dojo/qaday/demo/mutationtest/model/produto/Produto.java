package dojo.qaday.demo.mutationtest.model.produto;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

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

    private double preco;

    public Produto(DTOProduto produto) {
        this.nomeProduto = produto.nomeProduto();
        this.categoria = produto.categoria();
        this.fornecedor = produto.fornecedor();
        this.preco = produto.preco();
    }
}
