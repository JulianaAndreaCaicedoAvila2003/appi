import java.util.ArrayList;
import java.util.List;


public class usuario {
    private static String nombre;
    private String correo;
    private List<Perro> perros;
    private static boolean sesionIniciada;

    //Constructor
    public usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.perros = new ArrayList<>();
        this.sesionIniciada = false;
    }

    //Registro de usuario
    public void registrarse() {
        
    }

//Inicio de sesion
    public void iniciarSesion() {
        sesionIniciada = true;
    }

//Cierre de sesion
    public void cerrarSesion() {
        sesionIniciada = false;
    }

    //Agregar un perro
    public void agregarPerro(Perro perro) {
        perros.add(perro);
    }
// Infrmacion sesiones de entrenamiento
    public void mostrarInformacionSesionEntrenamiento() {
        if (sesionIniciada) {
            System.out.println("Información de entrenamiento para el usuario: " + nombre);
            for (Perro perro : perros) {
                System.out.println("Perro: " + perro.getNombre());
                perro.mostrarSesionesProgramadas();
            }
        } else {
            System.out.println("Debe iniciar sesión para ver la información de entrenamiento.");
        }
    }

    //El ususario Recibira notificaciones
    public static void recibirNotificacion(Notificacion notificacion) {
        if (sesionIniciada) {
            System.out.println("notificación para el usuario " + nombre + ": " + notificacion);
            
        } else {
            System.out.println(" se debe iniciar sesión para recibir notificaciones.");
        }
    }

   // Guardar los datos
    public void guardarDatos(String correo,String nombre,String perros) {
        
    }

    public static Object getNombre() {
        return null;
    }

    
}
