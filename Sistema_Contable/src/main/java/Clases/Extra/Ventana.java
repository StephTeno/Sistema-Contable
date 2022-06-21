package Clases.Extra;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
public class Ventana extends JFrame
{
/*      private JButton jbtn_boton;
        private JTextField jtxt_texto;
        private JLabel jlbl_label; */
        private void IniciarComponentes(){
                JPanel panel=new JPanel();
                panel.setBackground(Color.decode("#99CCFF"));
                this.getContentPane().add(panel);
        }
        public Ventana(String Titulo) {
                this.setTitle(Titulo);
                this.getContentPane().setBackground(Color.decode("#99CCFF"));
                this.setSize(500, 800);
                this.setLayout( new FlowLayout() );
                IniciarComponentes();
                this.setVisible( true );
                this.setLocationRelativeTo(null);
                this.setResizable(false);
                this.setMinimumSize(new Dimension(200,200));
                this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        }

        

}  