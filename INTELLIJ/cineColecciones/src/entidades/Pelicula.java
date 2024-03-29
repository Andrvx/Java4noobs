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

    public Pelicula(String titulo, String director, Integer duracion) {
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
        this.duracion = ((horas)*1000+(((minutos*1000) /60)));
    }

    public String getDuracionConFormato() {
        int horas = (duracion/1000);
        int minutos = (duracion - (horas*1000)) * 60 / 1000;
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
