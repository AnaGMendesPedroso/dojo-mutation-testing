package dojo.qaday.demo.mutationtest.controller;

import dojo.qaday.demo.mutationtest.model.pedido.DTOListagemPedidos;
import dojo.qaday.demo.mutationtest.model.pedido.DTOPedido;
import dojo.qaday.demo.mutationtest.model.pedido.EntityPedido;
import dojo.qaday.demo.mutationtest.model.pedido.PedidoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DTOPedido dados) {
        repository.save(new EntityPedido(dados));
    }

    @GetMapping
    public List<DTOListagemPedidos> listar() {
        return repository.findAll().stream().map(DTOListagemPedidos::new).toList();
    }
}
