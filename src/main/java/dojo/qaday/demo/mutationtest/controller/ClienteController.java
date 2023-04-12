package dojo.qaday.demo.mutationtest.controller;

import dojo.qaday.demo.mutationtest.model.cliente.ClienteRepository;
import dojo.qaday.demo.mutationtest.model.cliente.DTOCliente;
import dojo.qaday.demo.mutationtest.model.cliente.EntityCliente;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DTOCliente dados){
        System.out.println(dados);
        repository.save(new EntityCliente(dados));

    }
}
