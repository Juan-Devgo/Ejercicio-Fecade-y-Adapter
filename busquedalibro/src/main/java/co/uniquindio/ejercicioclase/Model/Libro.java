package co.uniquindio.ejercicioclase.Model;

public class Libro {
    private String titulo, autor, categoria;

    public Libro(String titulo, String autor, String categoria){
        assert titulo != null && !titulo.isBlank();
        assert autor != null && !autor.isBlank();
        assert categoria != null && !categoria.isBlank();

        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        String mensaje = "Título: " + titulo + "\nAutor: " + autor + "\nCategoría: " + categoria + "\n";
        return mensaje;
    }
    
}
