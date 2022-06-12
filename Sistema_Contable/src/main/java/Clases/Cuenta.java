package Clases;
public class Cuenta {
    private String No_Cuenta;
    private String Nombre_Cuenta;
    private double Cantidad;
    
    public Cuenta(String no_Cuenta, String nombre_Cuenta, double cantidad) {
        No_Cuenta = no_Cuenta;
        Nombre_Cuenta = nombre_Cuenta;
        Cantidad = cantidad;
    }

    public String getNo_Cuenta() {
        return No_Cuenta;
    }

    public void setNo_Cuenta(String no_Cuenta) {
        No_Cuenta = no_Cuenta;
    }

    public String getNombre_Cuenta() {
        return Nombre_Cuenta;
    }

    public void setNombre_Cuenta(String nombre_Cuenta) {
        Nombre_Cuenta = nombre_Cuenta;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double cantidad) {
        Cantidad = cantidad;
    }

    
}
