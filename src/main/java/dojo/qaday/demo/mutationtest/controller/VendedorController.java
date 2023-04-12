package dojo.qaday.demo.mutationtest.controller;

import dojo.qaday.demo.mutationtest.model.vendedor.DTOVendedor;
import dojo.qaday.demo.mutationtest.model.vendedor.EntityVendedor;
import dojo.qaday.demo.mutationtest.model.vendedor.VendedorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vendedor")
public class VendedorController {
    @Autowired
    private VendedorRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DTOVendedor dados){
        System.out.println(dados);
        repository.save(new EntityVendedor(dados));
    }
}
