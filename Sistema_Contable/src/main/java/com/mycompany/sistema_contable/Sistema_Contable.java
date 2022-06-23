package com.mycompany.sistema_contable;
import java.util.*;
import javax.swing.JOptionPane;
import Clases.Cuentas.*;
import Clases.Para_Registrar.R_Activos;
public class Sistema_Contable {
    /* public static double Sumatoria_Activos(ArrayList <R_Activos> a){
        double sumaA=0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getActivos().getClasificacion().equals("ACTIVOS")) {
                sumaA+=a.get(i).getRActivos().getCantidad();
            }
        }
        return sumaA;
    }
    public static double Sumatoria_Pasivos(ArrayList <Pasivos> a){
        double sumaA=0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getClasificacion().equals("PASIVOS")) {
                //sumaA+=a.get(i).getCantidad();
            }
        }
        return sumaA;
    }
    public static double Sumatoria_Capital(ArrayList <Capital> a){
        double sumaA=0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getClasificacion().equals("CAPITAL")) {
                //sumaA+=a.get(i).getCantidad();
            }
        }
        return sumaA;
    }
 */



    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        //ArrayList <Cuenta> cuenta=new ArrayList<>();
        Activos Caja=new Activos("1.1.1.1", "Caja", "Activo Circulante", "Activo Circulante Disponible");
        Activos Clientes=new Activos("1.1.2.1", "Clientes", "Activo Circulante", "Activo Circulante Realizable");
        Activos Empleados=new Activos("1.1.2.2", "Empleados", "Activo Circulante", "Activo Circulante Realizable");
        Activos Inventario=new Activos("1.1.2.3", "Inventario", "Activo Circulante", "Activo Circulante Realizable");
        Activos PapeleriasYUtiles=new Activos("1.1.2.3", "Papelerías Y Utiles", "Activo Circulante", "Activo Circulante Realizable");
        Activos Maquinaria=new Activos("1.2.1.1", "Maquinaria", "Activo No Circulante", "Activo Fijo");
        Activos Mobiliario=new Activos("1.2.1.2", "Mobiliario", "Activo No Circulante", "Activo Fijo");
        Pasivos Proveedores=new Pasivos("2.1.0.1", "Proveedores", "Pasivo No Circulante");
        Pasivos ImpuestoSobreRenta=new Pasivos("2.1.0.2", "Impuesto Sobre Renta", "Pasivo No Circulante");
        Capital CapitalSocial=new Capital("3.1.0.1", "Capital Social", "Capital Contribuido");
        Capital UtilidadDelEjercicio=new Capital("3.2.0.1", "Utilidad Del Ejercicio", "Capital Contribuido");
        double SIV=0;

        ArrayList <R_Activos> Inventarios=new ArrayList<>();
        boolean salir=false;
        String Botones[]={"Compra", "Pago", "Ventas"}, menu[] ={"Ingrese los movimientos de transacciones","Balanza de Comprobación","Estado Financieros"}, compras[]={"Inventario","Bienes inmuebles"}, pagos[]={"Servicios Básicos"}, venta[]={"Productos"};
        do{;
            String op = (String) JOptionPane.showInputDialog(null, "Elija el proceso a mostrar", "MENÚ", JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
            switch (op) {
                case "Ingrese los movimientos de transacciones":
                    //hd=true;
                    JOptionPane.showMessageDialog(null,"\n\tREGISTRO DE OPERACIONES");
                    int oP = JOptionPane.showOptionDialog (null, "\nPresione el botón de la transacción realizada", "REGISTRO DE OPERACIONES", 0 , JOptionPane.WARNING_MESSAGE, null, Botones, Botones[0]);
                    oP=oP+1;
                    switch (oP) {
                        case 1:
                            String com = (String) JOptionPane.showInputDialog(null, "¿Qué compró?", "COMPRA", JOptionPane.QUESTION_MESSAGE, null, compras, compras[0]);
                            switch (com) {
                                case "Inventario":
                                int cant=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Inventario a Registrar", "Inventario", JOptionPane.INFORMATION_MESSAGE));
                                for (int i = 0; i <cant; i++) {
                                    String fecha=JOptionPane.showInputDialog(null, "FECHA: ", "Inventario", JOptionPane.INFORMATION_MESSAGE);
                                    String descripcion=JOptionPane.showInputDialog(null, "DESCRIPCIÓN", "Inventario", JOptionPane.INFORMATION_MESSAGE);
                                    double cantidad=Double.parseDouble(JOptionPane.showInputDialog(null, "CANTIDAD", "Inventario", JOptionPane.INFORMATION_MESSAGE));
                                    double precio=Double.parseDouble(JOptionPane.showInputDialog(null, "PRECIO", "Inventario", JOptionPane.INFORMATION_MESSAGE));
                                    double fin=precio*cantidad;
                                    SIV+=fin;
                                    Inventarios.add(new R_Activos(fecha, descripcion, cantidad, Inventario, precio));
                                    
                                }
                                JOptionPane.showMessageDialog(null, "\nPRODUCTO REGISTRADOS EXITOSAMENTE \n", "REGISTRO EXITOSO", JOptionPane.INFORMATION_MESSAGE);                                    
                                    break;
                            
                                default:
                                    break;
                            }
                            break;
                        case 2:
                            String pago = (String) JOptionPane.showInputDialog(null, "¿Qué pagó?", "PAGO", JOptionPane.QUESTION_MESSAGE, null, pagos, pagos[0]);
                            switch (pago) {
                                case "Inventario":
                                    
                                    break;
                            
                                default:
                                    break;
                            }
                            break;

                        case 3:
                            String ven = (String) JOptionPane.showInputDialog(null, "¿Cuanto vendió por producto?", "VENTA", JOptionPane.QUESTION_MESSAGE, null, venta, venta[0]);
                            switch (ven) {
                                case "Inventario":
                                    
                                    break;
                            
                                default:
                                    break;
                            }
                            break;
                        default:
                            break;
                    }
                case "Balanza de Comprobación":
                    break;
                case "Estado Financieros":
                    break;
                default:
                    System.out.println("**Ha escogido una opción invalida, ¡Intentelo nuevamente!**");
                    break;
            }

        } while(!salir);
        l.close();
    }
}