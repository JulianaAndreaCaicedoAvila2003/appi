import java.util.ArrayList;
import java.util.List;

public class Perro {
    private String nombre;
    private List<Sesion_entrenamiento> sesionesEntrenamiento;
     
//constructor
    public Perro (String nombre) {
        this.nombre = nombre;
        this.sesionesEntrenamiento = new ArrayList<>();
    }

// Registro de progreso
    public void registrarProgreso(Sesion_entrenamiento sesion, String progreso) {
        sesion.registrarProgreso(progreso);
    }

// programar sesion
    public void programarSesionEntrenamiento(Sesion_entrenamiento sesion) {
        sesionesEntrenamiento.add(sesion);
    }

//mostrar las sesiones programadas
    public void mostrarSesionesProgramadas() {
        System.out.println("Sesiones programadas para " + nombre + ":");
        for (Sesion_entrenamiento sesion : sesionesEntrenamiento) {
            System.out.println(sesion.toString());
        }
    }
}
