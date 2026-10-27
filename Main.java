public class Main {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Team Colombia", "Colombia");

        Velocista velocista1 = new Velocista(1, "Rigoberto", 450.5, 65.0);
        Escalador escalador1 = new Escalador(2, "Nairo", 3.5f, 12.0f);
        Contrarrelojista contrarrelojista1 = new Contrarrelojista(3, "Egan", 55.5);

        equipo1.anadirCiclista(velocista1);
        equipo1.anadirCiclista(escalador1);
        equipo1.anadirCiclista(contrarrelojista1);

        equipo1.listarEquipo();
        
        System.out.println("\n--- Detalles de los ciclistas ---");
        velocista1.imprimir();
        System.out.println();
        escalador1.imprimir();
        System.out.println();
        contrarrelojista1.imprimir();
    }
}