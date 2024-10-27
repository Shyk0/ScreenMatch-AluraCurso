package com.alura.screenmatch.principal;

// Importamos las clases necesarias para este código
import com.alura.screenmatch.calculos.CalculadoraDeTiempo;
import com.alura.screenmatch.calculos.FiltroRecomendacion;
import com.alura.screenmatch.modelos.Episodio;
import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList; // Importa la clase ArrayList para manejar listas dinámicas

// Clase principal donde se ejecuta el programa
public class Principal {
    public static void main(String[] args) {

        // Creación de una instancia de la clase Pelicula llamada "Encanto" del año 2021
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        // Asignamos la duración de la película
        miPelicula.setDuracionEnMinutos(180);
        // Imprimimos la duración de la película
        System.out.println("Duración de la película: " + miPelicula.getDuracionEnMinutos());

        // Mostramos la ficha técnica de la película
        miPelicula.muestraFichaTecnica();
        // Evaluamos la película con diferentes puntajes
        miPelicula.evalua(8);
        miPelicula.evalua(5);
        miPelicula.evalua(10);
        // Mostramos el total de evaluaciones y la media de las evaluaciones
        System.out.println("Total de evaluaciones: " + miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMediaEvaluaciones());

        // Creación de una instancia de Serie llamada "Lost" del año 2000
        Serie lost = new Serie("Lost", 2000);
        // Mostramos la ficha técnica de la serie
        lost.muestraFichaTecnica();
        // Configuramos el número de temporadas, episodios y duración de cada episodio
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        // Imprimimos la duración total de la serie
        System.out.println("Duración de la serie: " + lost.getDuracionEnMinutos());

        // Creación de otra película llamada "Avatar" del año 2023 con duración de 200 minutos
        Pelicula otraPelicula = new Pelicula("Avatar", 2023);
        otraPelicula.setDuracionEnMinutos(200);

        // Creamos una instancia de la clase CalculadoraDeTiempo y añadimos películas y series
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluido(miPelicula);
        calculadora.incluido(otraPelicula);
        calculadora.incluido(lost);
        // Imprimimos el tiempo total calculado de todas las películas y series
        System.out.println(calculadora.getTiempoTotal());

        // Creamos una instancia de FiltroRecomendacion para filtrar los títulos recomendados
        FiltroRecomendacion filtro = new FiltroRecomendacion();
        filtro.filtra(miPelicula);  // Aplicamos el filtro a la película

        // Creamos un episodio para la serie Lost y lo configuramos
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizaciones(300);
        filtro.filtra(episodio);  // Aplicamos el filtro al episodio

        // Creamos otra película "El señor de los anillos" del año 2001
        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.setDuracionEnMinutos(180);

        // Creamos un ArrayList para almacenar las películas
        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        // Añadimos las películas al ArrayList
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);
        listaDePeliculas.add(peliculaDeBruno);

        // Imprimimos el tamaño de la lista de películas
        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());

        // Tratamos de obtener el nombre de la primera película (corregido a get(0) en lugar de getFirst())
        System.out.println("La primera película de la lista es: " + listaDePeliculas.get(0).getNombre());

        // Imprimimos la lista completa de películas
        System.out.println(listaDePeliculas);

        // Mostramos el toString de la tercera película en la lista
        System.out.println("ToString de la película: " + listaDePeliculas.get(2).toString());
    }
}
