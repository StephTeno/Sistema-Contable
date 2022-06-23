package Clases.Cuentas;
public class Gastos extends Cuenta{

    public Gastos (String no_Cuenta, String nombre_Cuenta, String sub_clasificacion, String sub_sub_c) {
        super(no_Cuenta, nombre_Cuenta, "GASTOS", sub_clasificacion, sub_sub_c);
    }
}
