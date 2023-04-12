package dojo.qaday.demo.mutationtest.model.produto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record DTOProduto(
        @NotBlank
        String nomeProduto,
        @NotNull @DecimalMin(value = "1.0")
        BigDecimal precoUnitario,
        @NotNull
        Fornecedor fornecedor,
        @NotNull
        Categoria categoria) {
}