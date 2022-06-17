package Clases.Para_Registrar;
import Clases.Cuentas.Activos;

public class R_Activos{
    private Registro rActivos;
    private Activos Activos;
    public R_Activos(Registro rActivos, Activos Activos) {
        this.rActivos = rActivos;
        this.Activos = Activos;
    }
    public Registro getRActivos() {
        return rActivos;
    }
    public void setRActivos(Registro rActivos) {
        this.rActivos = rActivos;
    }
    public Activos getActivos() {
        return Activos;
    }
    public void setActivos(Activos Activos) {
        this.Activos = Activos;
    }

    


}

