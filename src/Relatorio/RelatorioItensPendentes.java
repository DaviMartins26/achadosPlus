package Relatorio;

public class RelatorioItensPendentes implements RelatorioStrategy {
    @Override
    public void gerarRelatorio() {
        System.out.println("Gerando relatório de itens pendentes...");
        // lógica para contar pendentes
    }
}