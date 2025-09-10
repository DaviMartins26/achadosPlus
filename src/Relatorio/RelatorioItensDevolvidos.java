package Relatorio;

public class RelatorioItensDevolvidos implements RelatorioStrategy {
    @Override
    public void gerarRelatorio() {
        System.out.println("Gerando relatório de itens devolvidos...");
        // lógica para contar devolvidos
    }
}