public class Entrenador_Entrenamiento {

    public String Especialidad;

    public Entrenador_Entrenamiento(String Especialidad) {

        this.Especialidad = Especialidad;

    }

    public static String Crear_Plan_Entrenamiento() {

        return "Entrenamiento";

    }

    public static String Actualizar_Plan_De_Entrenamiento() {

        return "Actualizando...";

    }

    public static String Retroalimentacion_Para_El_Usuario() {

        return "Retroalimentacion";

    }

    protected String Generar_reportes_Estadisticas() {

        return "Reporte...";

    }

}
