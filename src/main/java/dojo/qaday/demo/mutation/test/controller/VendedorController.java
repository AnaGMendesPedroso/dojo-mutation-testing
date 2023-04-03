package dojo.qaday.demo.mutation.test.controller;

import dojo.qaday.demo.mutation.test.vendedor.Vendedor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {
    @PostMapping
    public void cadastrar(@RequestBody Vendedor dadosVendedor){
        System.out.println(dadosVendedor);
    }
}
