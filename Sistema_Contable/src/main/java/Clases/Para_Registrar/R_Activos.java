package Clases.Para_Registrar;
import Clases.Cuentas.Activos;

public class R_Activos{
    private Registro ra;
    private Activos a;
    public R_Activos(Registro ra, Activos a) {
        this.ra = ra;
        this.a = a;
    }
    public Registro getRa() {
        return ra;
    }
    public void setRa(Registro ra) {
        this.ra = ra;
    }
    public Activos getA() {
        return a;
    }
    public void setA(Activos a) {
        this.a = a;
    }

    


}

