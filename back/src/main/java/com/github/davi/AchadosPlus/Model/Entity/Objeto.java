package com.github.davi.AchadosPlus.Model.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Objeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idObjeto;
    private String nome_objeto;
    @ManyToOne
    @JoinColumn(name = "categoria")
    private Categoria categoria;
    private String descricao;
    @OneToOne
    @JoinColumn(name ="foto_relacionada")
    private Foto fotoObjeto;
    private int status; // 1-Perdido 2-Encontrado 3- Devolvido (regra de negocio mas podemos mudar pra String pra evitar if else no print da log ou algo assim)
    @OneToOne
    @JoinColumn(name = "protocolo_relacionado")
    private Protocolo relacionado;

}

