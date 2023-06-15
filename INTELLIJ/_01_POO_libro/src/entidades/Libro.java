//ISBN, Título, Autor,Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío
package entidades;

public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int pags;

    public Libro() {
        //constructor vacío
    }

    public Libro(String ISBN, String titulo, String autor, int pags) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.pags = pags;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPags(int pags) {
        this.pags = pags;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPags() {
        return pags;
    }
}

