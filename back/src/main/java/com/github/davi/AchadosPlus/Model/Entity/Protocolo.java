package com.github.davi.AchadosPlus.Model.Entity;

// pra notificar mudanças no Protocolo
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Protocolo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProtocolo;
    @OneToOne
    @JoinColumn (name ="objeto_perdido")
    private Objeto objetoPerdido;
    private int status; //0-aberto 1-fehcado mesma coisa com objeto
    private String dataCriacao; // usar dado de data de verdade, aqui é so um exemplo
    //@OneToMany
    //@JoinColumn(name = "Funcionario_Fechou")
    //private Usuario funFechado; //funcionario que fechou
    private String dataFechado;

    public void setIdProtocolo(Integer id) {
    }

    public Integer getIdProtocolo() {
        return idProtocolo;
    }

    public int getStatus() {
        return status;
    }

    public Objeto getObjetoPerdido() {
        return objetoPerdido;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public String getDataFechado() {
        return dataFechado;
    }

}
