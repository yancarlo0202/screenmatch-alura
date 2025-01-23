public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    void exibeFichaTecnica(){
        System.out.println("Título: " + nome);
        System.out.println("Ano: "  + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }
}
