package co.uniquindio.ejercicioclase.Model;

import java.util.List;

import  java.util.function.Predicate;

public class BuscadorLibro {
    private List<Libro> libros;

    public BuscadorLibro(List<Libro> libros) {
        this.libros = libros;
    }

    public Libro buscarPorTitulo(String titulo){
        Predicate<Libro> condicion = l -> l.getTitulo().contains(titulo);
        return libros.stream().filter(condicion).findFirst().get();
    }

    public Libro buscarPorAutor(String autor){
        Predicate<Libro> condicion = l -> l.getAutor().contains(autor);
        return libros.stream().filter(condicion).findFirst().get();
    }

    public Libro buscarPorCategoria(String categoria){
        Predicate<Libro> condicion = l -> l.getCategoria().contains(categoria);
        return libros.stream().filter(condicion).findFirst().get();
    }

}
