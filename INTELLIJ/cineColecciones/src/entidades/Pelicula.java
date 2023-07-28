package entidades;

import java.time.LocalDate;

//4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
//tendremos una clase Pelicula con el título, director y duración de la película (en horas).
public class Pelicula {
    private String titulo;
    private String director;
    private Integer duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracionDecimal() {
        return duracion;
    }

    public void setDuracionConFormato(int horas,int minutos) {
        this.duracion = ((Integer) (horas)+((Integer) minutos /60));
    }

    public String getDuracionConFormato() {
        int horas = (int) duracion;
        int minutos = (int) ((duracion - horas) * 60);
        return horas + ":" + minutos;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", duracion=" + getDuracionConFormato() +
                '}';
    }
}
