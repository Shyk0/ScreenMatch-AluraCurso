package com.alura.screenmatch.calculos;

// Clase que se encarga de filtrar recomendaciones según su clasificación
public class FiltroRecomendacion {
    private String recomendacion; // Atributo para almacenar la recomendación (aunque no se usa en este código)

    // Método que filtra objetos que implementan la interfaz Clasificable
    public void filtra(Clasificable clasificable) {
        // Se obtiene la clasificación del objeto y se evalúa en base a ella
        if (clasificable.getClasificacion() >= 4) {
            // Si la clasificación es 4 o mayor, se considera un favorito
            System.out.println("Está entre los favoritos del momento");
        } else if (clasificable.getClasificacion() >= 2) {
            // Si la clasificación está entre 2 y 3, se considera bien evaluado
            System.out.println("Bien evaluado actualmente");
        } else {
            // Si la clasificación es menor a 2, se sugiere para ver más tarde
            System.out.println("Colocalo en tu lista para verlo después");
        }
    }
}
