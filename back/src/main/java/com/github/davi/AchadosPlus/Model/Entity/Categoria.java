package com.github.davi.AchadosPlus.Model.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategoria;
    private String nomeCategoria;
    // Isso tava criando uma nova tabela que não seria usada até onde eu sei, qualquer coisa so descomentar
    //@OneToMany
    //private List<Objeto> objetos;
}
