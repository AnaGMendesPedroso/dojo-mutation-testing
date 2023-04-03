package dojo.qaday.demo.mutation.test.controller;

import dojo.qaday.demo.mutation.test.cliente.Cliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @PostMapping
    public void cadastrar(@RequestBody Cliente dadosCliente){
        System.out.println(dadosCliente);
    }
}
