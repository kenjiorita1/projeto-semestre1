package com.fatec.projeto.projeto2025.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.projeto.projeto2025.entities.Cliente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
        
        private static final Logger logger = LoggerFactory.getLogger(ClienteController.class.getName());

        private final List<Cliente> clientes = new ArrayList<>();

        private Long idCount = 1L ;


    //http://localhost:8080/api/cliente/criarCliente => POST
    @PostMapping("/criarCliente") 
    public String CriarCliente(@RequestBody Cliente cliente) {
        cliente.setId(idCount + 1);
        clientes.add(cliente);

        logger.info("Recebido JSON: Nome={}, Idade={}", cliente.getNome(), cliente.getIdade());
        return "O Cliente "+cliente.getNome()+ " de idade "+cliente.getIdade()+" foi criado";
    }

    @GetMapping("/clientes")
    public List<Cliente> getClientes() {
        return clientes;
    }

    @DeleteMapping("/cliente/{id}")
    public String ClienteDelete(@PathVariable Long id){
        for(Cliente cliente: clientes ){
            if(cliente.getId().equals(id)){
                clientes.remove(cliente);
                return "cliente deletado com sucesso!";
            }
        }
         return "cliente não encontrado!";
    }
    
}
