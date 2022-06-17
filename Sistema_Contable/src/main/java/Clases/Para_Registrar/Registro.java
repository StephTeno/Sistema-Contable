package Clases.Para_Registrar;
public class Registro {
    private String Fecha;
    private String Descripcion;
    private double Cantidad;
    public Registro(String fecha, String descripcion, double cantidad) {
        Fecha = fecha;
        Descripcion = descripcion;
        Cantidad = cantidad;
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
    public double getCantidad() {
        return Cantidad;
    }
    public void setCantidad(double cantidad) {
        Cantidad = cantidad;
    }

    
}
