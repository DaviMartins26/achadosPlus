package Busca;

import java.util.ArrayList;
import java.util.List;

// minha ideia ta acusando erro nos nome das coisas procurar o erro logo
// ser ta em plural e nomes com P ou p
public class BuscaProtocoloPorStatus implements BuscaStrategy<Protocolo> {
    @Override
    public List<Protocolo> buscar(List<Protocolo> protocolos, String criterio) {
        List<Protocolo> resultado = new ArrayList<>();
        for (Protocolo p : protocolos) {
            if (String.valueOf(p.getStatus()).equals(criterio)) {
                resultado.add(p);
            }
        }
        return resultado;
    }
}
