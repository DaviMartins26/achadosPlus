// package com.github.davi.AchadosPlus.Busca;


// import com.github.davi.AchadosPlus.Model.Entity.Objeto;

// import java.util.ArrayList;
// import java.util.List;

// // Problemas de não achar as coisas foi corrigido colocando a classe objeto em um package e importanto ele

// public class BuscaObjetoPorNome implements BuscaStrategy<Objeto> {
//     @Override
//     public List<Objeto> buscar(List<Objeto> objetos, String criterio) {
//         List<Objeto> resultado = new ArrayList<>();
//         for (Objeto o : objetos) {
//             if (o.getNomeObjeto().equalsIgnoreCase(criterio)) {
//                 resultado.add(o);
//             }
//         }
//         return resultado;
//     }
// }
