package Singletons;

import java.util.ArrayList;
import java.util.List;

import Busca.BuscaStrategy;
import Model.Objeto;

public class GerenciadorDeObjetos {
     //Cria a intancia unica (Static)
     private static GerenciadorDeObjetos instanciaObjetos;

     //Lista de protocolos, mudar pra DataBase Depois?
     private List<Objeto> objetos;

     // contrutor privado pra somente a classe poder acessar
     private GerenciadorDeObjetos(){
         objetos = new ArrayList<>();
     }

     // Cria a instancia quando o programa inicia
     public static GerenciadorDeObjetos getInstance(){
         if (instanciaObjetos == null){
             instanciaObjetos = new GerenciadorDeObjetos();
         }
         return instanciaObjetos;
     }

     // Metodo pra inserir protocolo
     public void adicionarObjeto(Objeto objeto){
         objetos.add(objeto); // com bando isso vai precisar mudar certamente
     }

    // Busca dinâmica com Strategy
    public List<Objeto> buscar(BuscaStrategy<Objeto> strategy, String criterio) {
        return strategy.buscar(objetos, criterio);
    }

     // Instancia pra alterar status do itens
     public void alterarStatus(int idObjeto,int novoStatus){

     }


}
