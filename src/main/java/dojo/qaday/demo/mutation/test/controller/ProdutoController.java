package dojo.qaday.demo.mutation.test.controller;

import dojo.qaday.demo.mutation.test.produto.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    @PostMapping
    public void cadastrar(@RequestBody Produto dadosCadastroProduto){
        System.out.println(dadosCadastroProduto);
    }
}
