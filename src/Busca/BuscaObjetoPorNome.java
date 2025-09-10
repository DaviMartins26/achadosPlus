package Busca;

import java.util.ArrayList;
import java.util.List;

// minha ideia ta acusando erro nos nome das coisas procurar o erro logo
// ser tem que ser Objeto ou Objetos e ver se o ou O
public class BuscaObjetoPorNome implements BuscaStrategy<Objeto> {
    @Override
    public List<Objeto> buscar(List<Objeto> objetos, String criterio) {
        List<Objeto> resultado = new ArrayList<>();
        for (Objeto o : objetos) {
            if (o.getNome().equalsIgnoreCase(criterio)) {
                resultado.add(o);
            }
        }
        return resultado;
    }
}
