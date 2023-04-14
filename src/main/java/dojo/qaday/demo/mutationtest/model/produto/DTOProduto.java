package dojo.qaday.demo.mutationtest.model.produto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
public record DTOProduto(
        @NotBlank
        String nomeProduto,
        @NotNull @DecimalMin(value = "1.0", message = "O valor mínimo de um produto é R$1,00.")
        double preco,
        @NotNull
        Fornecedor fornecedor,
        @NotNull
        Categoria categoria) {
    public DTOProduto(Produto produto) {
        this(produto.getNomeProduto(), produto.getPreco(), produto.getFornecedor(), produto.getCategoria());
    }
}