package com.mycompany.sistema_contable;
import java.util.*;
public class Sistema_Contable {

    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        boolean salir=false;
        int op;


        do{
            while(!l.hasNextInt())                             
            {
                System.out.println("Ingrese su opción: ");
                l.next();
            }
        
            op = l.nextInt();
            switch(op){

            }

        }while(!salir);
        l.close();
    }
}
