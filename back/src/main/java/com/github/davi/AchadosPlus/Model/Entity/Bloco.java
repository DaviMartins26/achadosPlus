package com.github.davi.AchadosPlus.Model.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Bloco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBloco;
    private String nomeBloco;
    // isso na teoria vai ajudar no banco
    //@OneToMany(mappedBy = "bloco", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    //private List<Sala> salas;
}
