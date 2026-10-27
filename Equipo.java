import java.util.Vector;

public class Equipo {
    private String nombre;
    private String pais;
    private static int totalTiempoCarrera = 0;
    private Vector<Ciclista> listaCiclistas;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.listaCiclistas = new Vector<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void anadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }

    public void listarEquipo() {
        System.out.println("Equipo: " + nombre + " (" + pais + ")");
        for (Ciclista c : listaCiclistas) {
            System.out.println("- " + c.getNombre() + " (" + c.imprimirTipo() + ")");
        }
    }

    public static int getTotalTiempoCarrera() {
        return totalTiempoCarrera;
    }

    public static void sumarTiempoCarrera(int tiempo) {
        totalTiempoCarrera += tiempo;
    }
}