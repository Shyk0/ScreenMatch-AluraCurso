package com.alura.screenmatch.modelos;

import com.alura.screenmatch.calculos.Clasificable;

// Clase Episodio que implementa la interfaz Clasificable
public class Episodio implements Clasificable {
    // Atributos de la clase Episodio
    private int numero;  // Número del episodio
    private String nombre;  // Nombre del episodio
    private Serie serie;  // Objeto Serie al que pertenece el episodio
    private int totalVisualizaciones;  // Cantidad total de visualizaciones del episodio

    // Método getter para obtener el número de visualizaciones
    public int getTotalVisualizaciones() {
        return totalVisualizaciones;
    }

    // Método setter para establecer el número de visualizaciones
    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }

    // Método getter para obtener el número del episodio
    public int getNumero() {
        return numero;
    }

    // Método setter para establecer el número del episodio
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Método getter para obtener el nombre del episodio
    public String getNombre() {
        return nombre;
    }

    // Método setter para establecer el nombre del episodio
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método getter para obtener la serie a la que pertenece el episodio
    public Serie getSerie() {
        return serie;
    }

    // Método setter para establecer la serie a la que pertenece el episodio
    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    // Implementación del método getClasificacion de la interfaz Clasificable
    // Se clasifica el episodio según el número de visualizaciones:
    // Si tiene más de 100 visualizaciones, se le da una clasificación de 4,
    // en caso contrario, se le asigna una clasificación de 2.
    @Override
    public int getClasificacion() {
        if (totalVisualizaciones > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
