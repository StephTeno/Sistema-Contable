package Clases.Cuentas;
public class Activos extends Cuenta{

    public Activos(String no_Cuenta, String nombre_Cuenta, String sub_clasificacion, double cantidad) {
        super(no_Cuenta, nombre_Cuenta, "ACTIVOS", sub_clasificacion, cantidad);
    }
}