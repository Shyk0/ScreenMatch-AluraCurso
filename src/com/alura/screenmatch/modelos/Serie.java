package com.alura.screenmatch.modelos;

// Clase Serie que hereda de la clase Titulo
public class Serie extends Titulo {
    // Atributos de la clase Serie
    private int temporadas;  // Número de temporadas de la serie
    private boolean activa;  // Indica si la serie sigue activa o ya terminó
    private int episodiosPorTemporada;  // Número de episodios por temporada
    private int minutosPorEpisodio;  // Duración de cada episodio en minutos

    public String toString(){
        return "Serie: " + this.getNombre() + "(" + this.getFechaDeLanzamiento() + ")";
    }

    // Constructor de la clase Serie, que inicializa el nombre y la fecha de lanzamiento
    public Serie(String nombre, int fechaDeLanzamiento) {
        this.setNombre(nombre);  // Establece el nombre de la serie
        this.setFechaDeLanzamiento(fechaDeLanzamiento);  // Establece el año de lanzamiento de la serie
    }

    // Método getter para obtener el número de temporadas
    public int getTemporadas() {
        return temporadas;
    }

    // Método setter para establecer el número de temporadas
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    // Método getter para verificar si la serie está activa
    public boolean isActiva() {
        return activa;
    }

    // Método setter para indicar si la serie sigue activa
    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    // Método getter para obtener el número de episodios por temporada
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    // Método setter para establecer el número de episodios por temporada
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    // Método getter para obtener la duración en minutos de cada episodio
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    // Método setter para establecer la duración en minutos de cada episodio
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    // Sobrescritura del método getDuracionEnMinutos() para calcular la duración total de la serie
    // La duración total se obtiene multiplicando las temporadas, episodios por temporada y minutos por episodio
    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
}
