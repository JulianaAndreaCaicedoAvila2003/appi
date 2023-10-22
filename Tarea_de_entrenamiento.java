import java.util.ArrayList;

public class Tarea_de_entrenamiento {

    public String Descripcion;

    public Tarea_de_entrenamiento(String descripcion) {
        Descripcion = descripcion;
    }

    protected enum Estado {
        EN_ESPERA, EN_PROGRESO, COMPLETADA, CANCELADA
    }

    protected String proceso_perro() {

        return "Proceso Perro";

    }

    private ArrayList<String> historial_progreso_del_Perro() {

        ArrayList<String> Historial = new ArrayList<String>();

        return Historial;

    }

    public String Evaluar_el_Progreso_del_Perro() {

        return "proceso";

    }

    public String Registrar_Proceso_del_perro(String proceso) {

        return "proceso actualizado";

    }

    public static void main(String[] args) {

    }

}
