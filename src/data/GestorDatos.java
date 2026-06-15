package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Gestiona la lectura de los tours almacenados en un archivo de texto.
 */
public class GestorDatos {

    /**
     * Lee los tours desde un archivo y los almacena en una colección.
     *
     * @param rutaArchivo ubicación del archivo de texto.
     * @return colección de tours leídos.
     */
    public ArrayList<Tour> cargarTours(String rutaArchivo) {

        ArrayList<Tour> tours = new ArrayList<>();

        try (BufferedReader lector =
                     new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            while ((linea = lector.readLine()) != null) {

                String[] datos = linea.split(";");

                String nombre = datos[0];
                String tipo = datos[1];
                int precio = Integer.parseInt(datos[2]);
                int duracionHoras = Integer.parseInt(datos[3]);

                Tour tour = new Tour(
                        nombre,
                        tipo,
                        precio,
                        duracionHoras
                );

                tours.add(tour);
            }

        } catch (IOException e) {
            System.out.println(
                    "Error al leer el archivo: " + e.getMessage()
            );
        }

        return tours;
    }
}