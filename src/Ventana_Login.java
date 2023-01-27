import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ventana_Login {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPanel Panel_Principal;
    private JButton ingresarButton;
    private JButton salirButton;
    private JLabel Jlabel_Usuario;
    private JLabel Jlabel_Contraseña;
    private JLabel Jlabel_Bienvenida;
    private JLabel Ican_usuario;

    public Ventana_Login(){
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame =new JFrame("Ventana_Componentes");
        frame.setContentPane(new Ventana_Login().Panel_Principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,250);
        frame.setVisible(true);
    }
}

