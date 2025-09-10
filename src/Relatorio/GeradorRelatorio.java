package Relatorio;

public class GeradorRelatorio {
    private RelatorioStrategy strategy;

// Permite mudar a estratégia em tempo de execução
    public void setStrategy(RelatorioStrategy strategy) {
        this.strategy = strategy;
    }

    public void executarRelatorio() {
        strategy.gerarRelatorio();
    }
}
