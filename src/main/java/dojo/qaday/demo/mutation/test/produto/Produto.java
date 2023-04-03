package dojo.qaday.demo.mutation.test.produto;

import java.math.BigDecimal;

public record Produto(String nome, BigDecimal precoUnitario, Fornecedor fornecedor, Categoria categoria) {
};