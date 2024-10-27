package com.alura.screenmatch.calculos;

import com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    // Variable que almacena el tiempo total acumulado en minutos
    private int tiempoTotal;

    // Método getter que devuelve el tiempo total calculado
    public int getTiempoTotal() {
        return this.tiempoTotal;
    }

    // Método que recibe un objeto de tipo 'Titulo' (puede ser una Película o una Serie)
    // y agrega su duración en minutos al total acumulado.
    public void incluido(Titulo titulo) {
        // Muestra por consola la información del título que se está agregando
        System.out.println("Agregando duración en minutos de " + titulo);

        // Suma la duración del título actual al tiempo total
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
}
