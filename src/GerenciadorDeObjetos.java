import java.util.ArrayList;
import java.util.List;

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

     // instancia que busca de acordo com ID
     public Objeto buscarProtocolo(int id){
         // fazer a logica depois
         return null;
     }

     // Instancia pra alterar status do itens
     public void alterarStatus(int idObjeto,int novoStatus){

     }


}
