package app;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

/**
 * Clase principal del sistema Llanquihue Tour.
 */
public class Main {

    public static void main(String[] args) {

        GestorDatos gestorDatos = new GestorDatos();

        String rutaArchivo = "resources/tours.txt";

        ArrayList<Tour> tours =
                gestorDatos.cargarTours(rutaArchivo);

        System.out.println("=== TODOS LOS TOURS ===");

        for (Tour tour : tours) {
            System.out.println(tour);
        }

        System.out.println();
        System.out.println("=== TOURS GASTRONÓMICOS ===");

        for (Tour tour : tours) {
            if (tour.getTipo().equalsIgnoreCase("Gastronómico")) {
                System.out.println(tour);
            }
        }
    }
}