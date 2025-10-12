package com.github.davi.AchadosPlus.Model.Entity;

// pra notificar mudanças no Protocolo


// import com.github.davi.AchadosPlus.Notificacao.NotificacaoSubject;
// import com.github.davi.AchadosPlus.Pessoas.Funcionario;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
    @JoinColumn (name ="protocolo")
    private Objeto objetoPerdido;
    private int status; //0-aberto 1-fehcado mesma coisa com objeto
    private String dataCriacao; // usar dado de data de verdade, aqui é so um exemplo
    //private Funcionario funFechado; //funcionario que fechou
    private String dataFechado;

}
