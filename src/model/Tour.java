package model;

/**
 * Representa un tour ofrecido por la agencia Llanquihue Tour.
 */
public class Tour {

    private String nombre;
    private String tipo;
    private int precio;
    private int duracionHoras;

    /**
     * Constructor de la clase Tour.
     *
     * @param nombre nombre del tour.
     * @param tipo tipo de tour.
     * @param precio precio del tour.
     * @param duracionHoras duración del tour en horas.
     */
    public Tour(String nombre, String tipo, int precio, int duracionHoras) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=$" + precio +
                ", duracionHoras=" + duracionHoras +
                '}';
    }
}