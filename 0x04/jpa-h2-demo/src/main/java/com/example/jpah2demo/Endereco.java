package com.example.jpah2demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Endereco implements Serializable{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(name = "logradoutro")
    public String logradouro;

    @Column(name = "endereco")
    public String endereco;

    @Column(name = "numero")
    public Long numero;

    @Column(name = "bairro")
    public String bairro;

    @Column(name = "cidade")
    public String cidade;

    @Column(name = "estado")
    public String estado;

}
