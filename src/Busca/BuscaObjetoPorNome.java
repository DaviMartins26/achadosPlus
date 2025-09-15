package Busca;

import Model.Objeto;
import java.util.ArrayList;
import java.util.List;

public class BuscaObjetoPorNome implements BuscaStrategy<Objeto> {
    @Override
    public List<Objeto> buscar(List<Objeto> objetos, String criterio) {
        List<Objeto> resultado = new ArrayList<>();
        for (Objeto o : objetos) {
            if (o.getNomeObjeto() != null && o.getNomeObjeto().equalsIgnoreCase(criterio)) {
                resultado.add(o);
            }
        }
        return resultado;
    }
}
