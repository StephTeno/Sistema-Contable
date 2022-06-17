package Clases.Para_Registrar;
public class Registro {
    private String Fecha;
    private String Descripcion;
    public Registro(String fecha, String descripcion) {
        Fecha = fecha;
        Descripcion = descripcion;
    }
    public String getFecha() {
        return Fecha;
    }
    public void setFecha(String fecha) {
        Fecha = fecha;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    
    
}
