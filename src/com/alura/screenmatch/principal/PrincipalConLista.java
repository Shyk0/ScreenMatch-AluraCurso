package com.alura.screenmatch.principal;

// Importa las clases Pelicula, Serie y Titulo, que se encuentran en el paquete modelos.
import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;  // Importa la clase ArrayList para manejar listas dinámicas.
import java.util.Collections;

// Clase principal donde se ejecuta el programa.
public class PrincipalConLista {
    public static void main(String[] args) {

        // Crea una instancia de la clase Pelicula con el nombre "Encanto" y año 2021.
        var miPelicula = new Pelicula("Encanto", 2021);
        // Evalúa la película "Encanto" con una puntuación de 1.
        miPelicula.evalua(1);

        // Crea otra instancia de Pelicula con el nombre "Avatar" y año 2023.
        var otraPelicula = new Pelicula("Avatar", 2023);
        // Evalúa la película "Avatar" con una puntuación de 10.
        otraPelicula.evalua(10);

        // Crea una tercera instancia de Pelicula llamada "El señor de los anillos" del año 2001.
        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        // Evalúa la película "El señor de los anillos" con una puntuación de 10.
        peliculaDeBruno.evalua(10);

        // Crea una instancia de la clase Serie con el nombre "Lost" y año 2000.
        Serie lost = new Serie("Lost", 2000);

        // Crea una lista de títulos (pueden ser Películas o Series).
        ArrayList<Titulo> lista = new ArrayList<>();
        // Añade las películas y la serie a la lista.
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(lost);

        // Itera sobre cada elemento de la lista (que puede ser una Pelicula o una Serie).
        for (Titulo item: lista){
            // Imprime el nombre del título (ya sea una película o serie).
            System.out.println(item.getNombre());
            // Si el elemento es una instancia de Pelicula, se ejecuta este bloque.
            if (item instanceof Pelicula pelicula){
                // Imprime la clasificación de la película.
                System.out.println(pelicula.getClasificacion());
            }
        }
        //ArrayList de Artistas
        ArrayList<String> listadeArtistas = new ArrayList<>();
        listadeArtistas.add("Penélope Cruz");
        listadeArtistas.add("Antonio Banderas");
        listadeArtistas.add("Ricardo Darín");

        //Lista desordenada
        System.out.println("Lista de artista desordenada: " + listadeArtistas);

        //Lista ordenada
        Collections.sort(listadeArtistas);
        System.out.println("Lista de artista ordenada: " +listadeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de pelicula organizado: " + lista);
    }
}
