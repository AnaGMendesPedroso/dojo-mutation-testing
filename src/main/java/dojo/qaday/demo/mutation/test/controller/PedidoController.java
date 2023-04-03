package dojo.qaday.demo.mutation.test.controller;

import dojo.qaday.demo.mutation.test.pedido.Pedido;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
    @PostMapping
    public void cadastrar(@RequestBody Pedido dadosCadastroPedido){
        System.out.println(dadosCadastroPedido);
    }
}
