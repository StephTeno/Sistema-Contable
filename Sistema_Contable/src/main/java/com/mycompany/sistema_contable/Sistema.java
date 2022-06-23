package com.mycompany.sistema_contable;
import java.util.*;

import Clases.BalanceComprobacion.Asiento;
import Clases.Estados_financieros.*;
public class Sistema {
    public static void Espera (){
        System.out.println("\n\n\n");
        try
        {
            Thread.sleep(3000);
        }
        catch (Exception e)
        {
            System.out.print(e);
        }
    }
    public static void Head(String App){
        System.out.print("\n \t \t \t \t    -----Aplicación--"+App+"-----");
        System.out.print("\n \t \t \t \t \t  Bienvenido a la aplicacón");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n \t \t \t \t \t \t \t MENÚ");
    }
    public static void Menu(String o1, String o2, String o3, String o4){
        System.out.print("\nOpción 1: "+o1+
                         "\nOpción 2: "+o2+
                         "\nOpción 3: "+o3+
                         "\nOpción 4: "+o4);
        System.out.println(" ");
    }
    public static void Menu1(String o1, String o2, String o3)
    {
        System.out.print("\nOpción 1: "+o1+
                         "\nOpción 2: "+o2+
                         "\nOpción 3: "+o3);
        System.out.println(" ");
    }
    public static void Error(){
        System.out.print("\n \t \t \t    Ha ingresado un valor inválido... Vuelva a intentarlo nuevamente.");
        System.out.print("\n");
        System.out.print("\n");
    }
    public static void Exit(String App){
        System.out.print("\n \t \t \t    -----SALIENDO-DE-LA-APP-"+App+"-----");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n \t \t \t    Esperamos que le vaya bien...¡Hasta pronto!");
        System.out.print("\n");
        System.out.print("\n");
    }
    public static void main(String[] args) {
        Scanner l= new Scanner(System.in);
        boolean salir=false, hp=false;
        int op, o, cont=-1, con=-1;
        ArrayList<ElementosEF> Activos=new ArrayList<>();
        ArrayList<ElementosEF> Pasivos=new ArrayList<>();
        ArrayList<ElementosEF> Capital=new ArrayList<>();
        ArrayList<ElementosEF> Ingresos=new ArrayList<>();
        ArrayList<ElementosEF> Gastos=new ArrayList<>();
        ArrayList<Asiento> Venta=new ArrayList<>();
        ArrayList<Asiento> Compra=new ArrayList<>();
        ArrayList<Asiento> Cobro=new ArrayList<>();
        ArrayList<Asiento> Pago=new ArrayList<>();
       
        Activos.add(new ElementosEF("1.1.1.1", "Caja", 0));
        Activos.add(new ElementosEF("1.1.2.1", "Clientes", 0));
        Activos.add(new ElementosEF("1.1.2.2", "Empleados", 0));
        Activos.add(new ElementosEF("1.1.2.3", "Inventario", 0));
        Activos.add(new ElementosEF("1.1.2.4", "Papelerías y Utiles", 0));
        Pasivos.add(new ElementosEF("2.1.0.1", "Proveedores", 0));
        Pasivos.add(new ElementosEF("2.1.0.2", "Proveedores", 0));
        Pasivos.add(new ElementosEF("2.1.0.3", "Proveedores", 0));
        Capital.add(new ElementosEF("3.1.0.1", "Capital Social", 0));
        Capital.add(new ElementosEF("3.2.0.1", "Utilidad del Ejercicio", 0));
        Ingresos.add(new ElementosEF("4.1.0.1", "Capital Social", 0));
        Gastos.add(new ElementosEF("5.1.0.1", "Costo de Venta", 0));

        do {
            Head("Sistema Contable");
            Menu("Realizar Asiento Diario", "Balanza de Comprobación", "Estado de Resultados", "Balance General");
            op=l.nextInt();
            switch (op) {
                case 1:
                hp=true;
                if(cont<10000){
                    cont++;
                    Menu1("Asiento de venta", "Asiento de Compra","Salir de Asientos");
                    o=l.nextInt();
                    switch (o) {
                        case 1:
                        if(con<10000){
                            con++;
                            System.out.print("\n---ASIENTO DE VENTA---");
                            System.out.print("\n(Primera cuenta Debe)(Segunda Cuenta Haber)");
                            System.out.print("\nRegistro N°: ");
                            int Registro=l.nextInt();
                            System.out.print("\nCuenta: ");
                            String Cuenta=l.next();
                            System.out.print("\nReferencia: ");
                            String Ref=l.next();
                            System.out.print("\nDebe: ");
                            double Debe=l.nextDouble();
                            System.out.print("\nCuenta: ");
                            String Cuenta1=l.next();
                            System.out.print("\nReferencia: ");
                            String Ref1=l.next();
                            System.out.print("\nDebe: ");
                            double Haber=l.nextDouble();
                            Venta.add(new Asiento(Debe, Haber, Cuenta, Cuenta1, Registro, Ref, Ref1));
                            
                        }
                            break;
                        
                        case 2:

                            break;

                        case 3:

                            break;

                        default:
                            break;
                    }
                    
                }
                    break;
                
                case 2:
                    
                    break;
                    
                case 3:
                    
                    break;
                    
                case 4:
                    
                    break;
            
                default:
                    break;
            }
        } while (!salir);


    
    
    
    
    }
    
}