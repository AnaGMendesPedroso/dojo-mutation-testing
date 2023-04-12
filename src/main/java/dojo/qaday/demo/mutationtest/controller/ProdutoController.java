package dojo.qaday.demo.mutationtest.controller;

import dojo.qaday.demo.mutationtest.model.produto.DTOProduto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produto")
public class ProdutoController {
    @PostMapping
    public void cadastrar(@RequestBody DTOProduto DTOProduto){
        System.out.println(DTOProduto);
    }
}
