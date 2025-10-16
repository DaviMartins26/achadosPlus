package com.github.davi.AchadosPlus.dto;


//DTO significa Data Transfer Object
// tem o objetivo de controlar oque vai sair do back e ir pro front pra evitar um Json com a senha do usuario
public class UsuarioDTO {
    private Integer idUsuario;
    private String nome;

    public UsuarioDTO(Integer idUsuario, String nome) {
        this.idUsuario = idUsuario;
        this.nome = nome;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }
}
