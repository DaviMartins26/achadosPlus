package Busca;

import java.util.List;

public interface BuscaStrategy<Generico> {
    List<Generico> buscar(List<Generico> elementos, String criterio);
}
