package Clases.Extra;
import javax.swing.*;
import java.awt.*;
/* import java.awt.event.*; */
public class Ventana extends JFrame
{
/*      private JButton jbtn_boton;
        private JTextField jtxt_texto;
        private JLabel jlbl_label; */

        public Ventana(String Titulo) {
        this.setSize(500, 800);
        this.setTitle(Titulo);
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        this.setLayout( new FlowLayout() );
        this.setVisible( true );
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setMinimumSize(new Dimension(200,200));
        this.getContentPane().setBackground(Color.decode("#99CCFF"));
        }

}  