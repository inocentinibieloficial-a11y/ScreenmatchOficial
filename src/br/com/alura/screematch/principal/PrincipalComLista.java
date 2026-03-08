package br.com.alura.screematch.principal;

import br.com.alura.screenmatchoficial.modelos.Filme;
import br.com.alura.screenmatchoficial.modelos.Serie;
import br.com.alura.screenmatchoficial.modelos.Titulo;

import java.util.*;

public class PrincipalComLista {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Batman", 2022);
        meuFilme.avalia(9);
        var filmeDoPaulo = new Filme("Dogvilla", 2003);
        filmeDoPaulo.avalia(5);
        Filme nextFilm = new Filme("Pacman" , 2020);
        nextFilm.avalia(7);
        Serie lost = new Serie("Lost", 2000);
        lost.avalia(8);

        Filme f1 = filmeDoPaulo;

        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(nextFilm);
        lista.add(filmeDoPaulo);
        lista.add(lost);
        for(Titulo item: lista){
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação : " + filme.getClassificacao());
            }



        }

        ArrayList<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Adam Sandler");
        buscarPorArtista.add("Paulo");
        buscarPorArtista.add("Jacas");
        System.out.println(buscarPorArtista);

        Collections.sort(buscarPorArtista);
        System.out.println("Depois da ordenação ");
        System.out.println(buscarPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano :");
        System.out.println(lista);

    }
}
