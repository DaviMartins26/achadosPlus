package com.github.davi.AchadosPlus.Model.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSala;
    private String nomeSala;
    @ManyToOne
    @JoinColumn(name = "id_bloco")
    private Bloco bloco;
}
