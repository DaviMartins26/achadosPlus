package Busca;

import Model.Protocolo;
import java.util.ArrayList;
import java.util.List;

// Problemas de não achar as coisas foi corrigido colocando a classe em um Package em um package e importanto ele

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
