import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import javax.swing.text.DefaultStyledDocument;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Clube da Luta", 1999);
        meuFilme.setDuracaoEmMinutos(139);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8.7);
        meuFilme.avalia(5.6);
        meuFilme.avalia(9.8);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        //System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());

        Serie minhaSerie = new Serie("Breaking Bad", 2008);
        minhaSerie.setTemporadas(5);
        minhaSerie.setEpisodiosPorTemporada(15);
        minhaSerie.setDuracaoEmMinutos(2820);
        minhaSerie.exibeFichaTecnica();

        Filme outroFilme = new Filme("O Fantástico Senhor Raposo", 2009);
        outroFilme.setDuracaoEmMinutos(87);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao avaliacao = new FiltroRecomendacao();
        avaliacao.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalDeVisualizacoes(300);
        avaliacao.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Número de filmes: "+ listaDeFilmes.size());
        System.out.println("Primeiro filme: "+ listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println(listaDeFilmes.get(0).toString());

    }
}
