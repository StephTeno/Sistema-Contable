package Clases.Extra;
import javax.swing.*;
import java.awt.*;
/* import java.awt.event.*;  */
public class Ventana extends JFrame{
/*         private JButton jbtn_boton;
        private JTextField jtxt_texto; */
        private void IniciarComponentes(){
                JPanel panel=new JPanel();
                panel.setLayout(null);
                panel.setBackground(Color.decode("#99CCFF"));
                JLabel Etiqueta=new JLabel();
                Etiqueta.setText("Hola");
                Etiqueta.setBounds(10, 10, 50, 60);
                Etiqueta.setForeground(Color.WHITE); //Color del font
                panel.add(Etiqueta);
                this.getContentPane().add(Etiqueta);
        }
        public Ventana(String Titulo) {
                this.setTitle(Titulo);
                this.getContentPane().setBackground(Color.decode("#99CCFF"));
                this.setSize(800, 600);
                IniciarComponentes();
                this.setVisible( true );
                this.setLocationRelativeTo(null);
                //this.setResizable(false);
                this.setMinimumSize(new Dimension(200,200));
                this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        }

        

}  