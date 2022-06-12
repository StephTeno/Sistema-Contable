package Clases;
public class Cuenta {
    private String No_Cuenta;
    private String Nombre_Cuenta;
    private double Cantidad;

    public Cuenta(String no_Cuenta, String nombre_Cuenta, double cantidad) {
        this.No_Cuenta = no_Cuenta;
        this.Nombre_Cuenta = nombre_Cuenta;
        this.Cantidad = cantidad;
    }

    public String getNo_Cuenta() {
        return this.No_Cuenta;
    }

    public void setNo_Cuenta(String no_Cuenta) {
        this.No_Cuenta = no_Cuenta;
    }

    public String getNombre_Cuenta() {
        return this.Nombre_Cuenta;
    }

    public void setNombre_Cuenta(String nombre_Cuenta) {
        this.Nombre_Cuenta = nombre_Cuenta;
    }

    public double getCantidad() {
        return this.Cantidad;
    }

    public void setCantidad(double cantidad) {
        this.Cantidad = cantidad;
    }

    
}
