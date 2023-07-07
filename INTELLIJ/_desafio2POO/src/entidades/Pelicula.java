package entidades;

public class Pelicula {
    private String titulo;
    private String director;
    private String genero;
    private int anio;
    private int duracion;

    public Pelicula(String titulo, String director, String genero, int anio, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.anio = anio;
        this.duracion = duracion;
    }

    public Pelicula() {
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(int opcion) {
        switch (opcion){
            case 1:
                this.genero = "Acción";
                break;
            case 2:
                this.genero = "Aventura";
                break;
            case 3:
                this.genero = "Drama";
                break;
            case 4:
                this.genero = "Policial";
                break;
            case 5:
                this.genero = "Anime Hentai";
                break;
        }
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "Título='" + titulo + '\'' +
                ", Director='" + director + '\'' +
                ", Género='" + genero + '\'' +
                ", Año=" + anio +
                ", Duración=" + duracion +
                '}';
    }
}
