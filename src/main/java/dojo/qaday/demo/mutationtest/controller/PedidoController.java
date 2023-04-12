package dojo.qaday.demo.mutationtest.controller;

import dojo.qaday.demo.mutationtest.model.pedido.DTOPedido;
import dojo.qaday.demo.mutationtest.model.pedido.EntityPedido;
import dojo.qaday.demo.mutationtest.model.pedido.PedidoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DTOPedido dados) {
        System.out.println(dados);
        repository.save(new EntityPedido(dados));
    }
}
