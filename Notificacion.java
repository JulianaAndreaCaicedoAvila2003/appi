
public class Notificacion {

    private String mensaje;
    private String remitente;
    private String receptor;
    private String fechaEnvio;

    public Notificacion(String mensaje, String remitente, String receptor, String fechaEnvio) {
        this.mensaje = mensaje;
        this.remitente = remitente;
        this.receptor = receptor;
        this.fechaEnvio = fechaEnvio;
    }

    public Notificacion(String mensaje2, String string, Object nombre) {
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    @Override
    public String toString() {
        return "Remitente: " + remitente + "\nReceptor: " + receptor + "\nFecha de Envío: " + fechaEnvio + "\nMensaje: " + mensaje;
    }
}

