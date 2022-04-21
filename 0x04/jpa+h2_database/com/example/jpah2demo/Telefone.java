package com.example.jpah2demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "telefone")
@Entity
public class Telefone implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public Long ddd;

    public Long numero;

    @ManyToOne
    @Transient
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Telefone() {
    }

    public Telefone(Long id, Long ddd, Long numero, Cliente cliente) {
        this.id = id;
        this.ddd = ddd;
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDdd() {
        return ddd;
    }

    public void setDdd(Long ddd) {
        this.ddd = ddd;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

}
