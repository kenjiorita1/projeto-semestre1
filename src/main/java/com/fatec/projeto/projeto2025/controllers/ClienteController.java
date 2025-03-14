package com.fatec.projeto.projeto2025.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.projeto.projeto2025.entities.Cliente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
        private static final Logger logger = LoggerFactory.getLogger(ClienteController.class.getName());

    //http://localhost:8080/api/cliente/criarCliente => POST
    @PostMapping("/criarCliente")
    public String CriarCliente(@RequestBody Cliente cliente) {
        logger.info("Recebido JSON: Nome={}, Idade={}", cliente.getNome(), cliente.getIdade());
        return "O Cliente "+cliente.getNome()+ " de idade "+cliente.getIdade()+" foi criado";
    }
}
