package com.example.jpah2demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public Long id = null;

    @Column(name = "nome")
    public String nome = null;

    @Column(name = "idade")
    public Long idade = null;

    @Column(name = "email")
    public String email = null;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Column(name = "telefones")
    private List<Telefone> telefones = new ArrayList<>();

    @Column(name = "endereco")
    private List<Endereco> endereco = new ArrayList<>();

}


