
public class Sesion_entrenamiento {
    private String fecha;
    private String hora;
    private String ejerciciosRealizados;
    private String progreso;
    private boolean recordatorioEnviado;
    private boolean cancelada;

    //Construcor
    public Sesion_entrenamiento(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
        this.ejerciciosRealizados = "";
        this.progreso = "";
        this.recordatorioEnviado = false;
        this.cancelada = false;
    }

//Registrar el ejercicio realizado
    public void registrarEjercicioRealizado(String ejercicio) {
        ejerciciosRealizados += ejercicio + ", ";
    }

// Registrar progreso
    public void registrarProgreso(String progreso) {
        this.progreso = progreso;
    }
// Enviar recordatorio
    public void enviarRecordatorio() {
        if (!recordatorioEnviado) {
            
            recordatorioEnviado = true;
        }
    }

// cancelar sesion
    public void cancelarSesion() {
        cancelada = true;
    }

// Verificacion de cancelacion
    public boolean estaCancelada() {
        return cancelada;
    }
    
// detalles de la sesion como Hora y Fecha
    public String obtenerDetallesSesion() {
        return "Fecha: " + fecha + ", Hora: " + hora + "\nEjercicios Realizados: " + ejerciciosRealizados + "\nProgreso: " + progreso;
    }

    @Override
    public String toString() {
        return "Fecha: " + fecha + ", Hora: " + hora + "\nEjercicios Realizados: " + ejerciciosRealizados + "\nProgreso: " + progreso + "\nCancelada: " + cancelada;
    }
}
