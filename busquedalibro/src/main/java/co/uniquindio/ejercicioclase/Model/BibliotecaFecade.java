package co.uniquindio.ejercicioclase.Model;

import java.util.List;

public class BibliotecaFecade {
    private BuscadorLibro buscadorLibros;

    public BibliotecaFecade(List<Libro> libros) {
        this.buscadorLibros = new BuscadorLibro(libros);
    }

    public Libro buscarPorTitulo(String titulo) {
        Libro libro = buscadorLibros.buscarPorTitulo(titulo);
        return libro;
    }

    public Libro buscarPorAutor(String autor) {
        Libro libro = buscadorLibros.buscarPorAutor(autor);
        return libro;
    }
    public Libro buscarPorCategoria(String categoria) {
        Libro libro = buscadorLibros.buscarPorCategoria(categoria);
        return libro;
    }
}
