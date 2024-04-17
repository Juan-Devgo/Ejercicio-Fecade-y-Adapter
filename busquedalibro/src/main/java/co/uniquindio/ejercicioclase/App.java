package co.uniquindio.ejercicioclase;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import co.uniquindio.ejercicioclase.Model.BibliotecaFecade;
import co.uniquindio.ejercicioclase.Model.Libro;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {  //Primero no era public
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        var libro1 = new Libro("La TGS","Bertalanffy", "Sistemas");
        var libro2 = new Libro("Introducción a la TGS","Johansen Bertoglio", "Sistemas");
        var libro3 = new Libro("La divina comedia","JuanSe", "God");

        List<Libro> libros = new ArrayList<>(); libros.add(libro1); libros.add(libro2); libros.add(libro3);

        var fachadaBiblioteca = new BibliotecaFecade(libros);
        
        var consulta1 = fachadaBiblioteca.buscarPorAutor("Johansen");
        System.out.println(consulta1.toString());

        var consulta2 = fachadaBiblioteca.buscarPorCategoria("Sistem");
        System.out.println(consulta2.toString());

        var consulta3 = fachadaBiblioteca.buscarPorTitulo("comedia");
        System.out.println(consulta3.toString());
    }

}