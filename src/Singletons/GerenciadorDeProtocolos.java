package Singletons;

import java.util.ArrayList;
import java.util.List;

import Busca.BuscaStrategy;
import Model.Protocolo;
import Pessoas.Funcionario;

public class GerenciadorDeProtocolos {
    //Cria a intancia unica (Static)
    private static GerenciadorDeProtocolos instancia;

    //Lista de protocolos, mudar pra DataBase Depois?
    private List<Protocolo> protocolos;

    // contrutor privado pra somente a classe poder acessar
    private GerenciadorDeProtocolos(){
        protocolos = new ArrayList<>();
    }

    // Cria a instancia quando o programa inicia
    public static GerenciadorDeProtocolos getInstance(){
        if (instancia == null){
            instancia = new GerenciadorDeProtocolos();
        }
        return instancia;
    }

    // Metodo pra inserir protocolo
    public void adicionarProtocolo(Protocolo protocolo){
        protocolos.add(protocolo); // com bando isso vai precisar mudar certamente
    }

    // Busca dinâmica com Strategy
    public List<Protocolo> buscar(BuscaStrategy<Protocolo> strategy, String criterio) {
        return strategy.buscar(protocolos, criterio);
    }


    // Instancia pra fecchar o protocolo
    public void fecharProtocolo(int id, String dataAtual, Funcionario funcionario){

    }

    //instancia de listar todos os protocolos
    public void listarProtocolos(){
        for (Protocolo p: protocolos){
            p.getResumo(); // Na teoria isso vai Printar o resumo de todos os protocolos registrados
        }
    }






}
