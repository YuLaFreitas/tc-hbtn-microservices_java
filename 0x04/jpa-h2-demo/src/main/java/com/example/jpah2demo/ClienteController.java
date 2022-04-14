package com.example.jpah2demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController{

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("/addClient")
    public ResponseEntity<Cliente> addClient(@RequestBody Cliente cliente) {
        return new ResponseEntity<Cliente>(clienteRepository.save(cliente), HttpStatus.OK);
    }

    @GetMapping("/findAllClients")
    public ResponseEntity<List<Cliente>> findAllClients() {
        return new ResponseEntity<List<Cliente>>(clienteRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/findClientById/{id}")
    public ResponseEntity<Cliente> findClientById(@PathVariable("id") Long idClient) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(idClient);
        return new ResponseEntity<Cliente>(clienteOptional.get(), HttpStatus.OK);
    }

    @DeleteMapping("/removeClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removerCliente(@PathVariable("id") Long idClient){
        clienteRepository.deleteById(idClient);
    }

    @PutMapping("/updateClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente){
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);

        if(!clienteOptional.equals(null)){
            clienteRepository.delete(clienteOptional.get());
            clienteRepository.save(cliente);
        }
    }
}