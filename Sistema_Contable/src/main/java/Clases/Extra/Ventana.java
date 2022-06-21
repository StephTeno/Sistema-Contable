package Clases.Extra;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ventana extends JFrame
{
    
        public Ventana(String Titulo) {
        this.setSize(500, 800);
        this.setTitle(Titulo);
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        this.setLayout( new FlowLayout() );
        this.setVisible( true );
        }
}  