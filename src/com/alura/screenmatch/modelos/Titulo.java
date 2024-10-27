package com.alura.screenmatch.modelos;

// Clase base que representa un Título, como una película o serie
public class Titulo implements Comparable<Titulo>{
    // Atributos de la clase Titulo
    private String nombre;  // Nombre del título (película o serie)
    private int fechaDeLanzamiento;  // Año de lanzamiento
    private boolean incluidoEnElPlan;  // Indica si está incluido en el plan de suscripción
    private double sumaDeLasEvaluaciones;  // Suma de todas las evaluaciones dadas
    private int totalDeEvaluaciones;  // Total de evaluaciones recibidas
    private int duracionEnMinutos;  // Duración en minutos del título

    // Método getter para obtener el nombre del título
    public String getNombre() {
        return nombre;
    }

    // Método getter para obtener el año de lanzamiento del título
    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    // Método getter para verificar si está incluido en el plan de suscripción
    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    // Método getter para obtener la duración en minutos del título
    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    // Método getter para obtener el total de evaluaciones
    public int getTotalDeEvaluaciones() {
        return totalDeEvaluaciones;
    }

    // Método setter para asignar el nombre del título
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método setter para asignar el año de lanzamiento
    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    // Método setter para indicar si el título está incluido en el plan
    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    // Método setter para establecer la duración en minutos
    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    // Método que muestra la ficha técnica del título, imprime el nombre y el año de lanzamiento
    public void muestraFichaTecnica() {
        System.out.println("Nombre de la película: " + nombre);
        System.out.println("Año de lanzamiento: " + fechaDeLanzamiento);
    }

    // Método para agregar una nueva evaluación
    // Suma la nota de la evaluación a la suma total y aumenta el contador de evaluaciones
    public void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
        totalDeEvaluaciones++;
    }

    // Método para calcular la media de las evaluaciones
    // Devuelve el promedio de las evaluaciones acumuladas
    public double calculaMediaEvaluaciones() {
        return sumaDeLasEvaluaciones / totalDeEvaluaciones;
    }


    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}
