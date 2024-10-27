package com.alura.screenmatch.modelos;

// Importamos la interfaz Clasificable, que contiene el método getClasificacion()
import com.alura.screenmatch.calculos.Clasificable;

// La clase Pelicula extiende de Titulo e implementa la interfaz Clasificable
public class Pelicula extends Titulo implements Clasificable {
    // Atributo específico para la clase Pelicula
    private String director;

    // Constructor de la clase Pelicula, recibe nombre y fecha de lanzamiento
    public Pelicula(String nombre, int fechaDeLanzamiento) {
        // Asignamos el nombre y la fecha de lanzamiento usando los métodos heredados de Titulo
        this.setNombre(nombre);
        this.setFechaDeLanzamiento(fechaDeLanzamiento);
    }

    // Getter para obtener el nombre del director de la película
    public String getDirector() {
        return director;
    }

    // Setter para asignar el nombre del director
    public void setDirector(String director) {
        this.director = director;
    }

    // Sobrescribimos el método getClasificacion de la interfaz Clasificable
    // Aquí se utiliza el cálculo de la media de evaluaciones (heredada de Titulo)
    // y se divide por 2 para obtener la clasificación
    @Override
    public int getClasificacion() {
        return (int) calculaMediaEvaluaciones() / 2;
    }

    // Sobrescribimos el método toString para devolver una representación en formato texto de la película
    @Override
    public String toString() {
        // Devuelve el nombre de la película y su año de lanzamiento
        return "Pelicula: " + this.getNombre() + " (" + getFechaDeLanzamiento() + ")";
    }
}
