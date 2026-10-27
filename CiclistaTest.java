public class CiclistaTest {
    public static void main(String[] args) {
        System.out.println("Ejecutando pruebas unitarias del sistema...");

        // Prueba 1: Validar creación de Velocista y su tipo
        Velocista v = new Velocista(1, "Rigoberto", 450.5, 65.0);
        assert v.getNombre().equals("Rigoberto") : "Error en el nombre del velocista";
        assert v.imprimirTipo().equals("Es un Velocista") : "Error en el tipo de ciclista";

        // Prueba 2: Validar creación de Escalador
        Escalador e = new Escalador(2, "Nairo", 3.5f, 12.0f);
        assert e.getIdentificador() == 2 : "Error en el identificador del escalador";

        // Prueba 3: Validar gestión del equipo
        Equipo equipo = new Equipo("Team Colombia", "Colombia");
        equipo.anadirCiclista(v);
        equipo.anadirCiclista(e);

        System.out.println("¡Todas las pruebas unitarias pasaron exitosamente!");
    }
}