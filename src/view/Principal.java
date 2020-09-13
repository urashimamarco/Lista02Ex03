package view;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import controller.BolinhaController;
public class Principal extends JFrame {
private static final long serialVersionUID = 1L;
private JPanel contentPane;
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Principal frame = new Principal();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
public Principal() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 450, 300);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);

JLabel lblBolinha1 = new JLabel(".");
lblBolinha1.setFont(new Font("Tahoma", Font.BOLD, 70));
//lblBolinha1.setBounds(58, 64, 68, 74);
lblBolinha1.setBounds(0, 40, 70, 70);
contentPane.add(lblBolinha1);

JLabel lblBolinha2 = new JLabel(".");
lblBolinha2.setFont(new Font("Tahoma", Font.BOLD, 70));
//lblBolinha2.setBounds(313, 64, 68, 74);
lblBolinha2.setBounds(0, 60, 70, 70);
contentPane.add(lblBolinha2);

JLabel lblBolinha3 = new JLabel(".");
lblBolinha3.setFont(new Font("Tahoma", Font.BOLD, 70));
//lblBolinha2.setBounds(313, 64, 68, 74);
lblBolinha3.setBounds(0, 80, 70, 70);
contentPane.add(lblBolinha3);

JLabel lblBolinha4 = new JLabel(".");
lblBolinha4.setFont(new Font("Tahoma", Font.BOLD, 70));
//lblBolinha2.setBounds(313, 64, 68, 74);
lblBolinha4.setBounds(0, 100, 70, 70);
contentPane.add(lblBolinha4);

JLabel lblBolinha5 = new JLabel(".");
lblBolinha5.setFont(new Font("Tahoma", Font.BOLD, 70));
//lblBolinha2.setBounds(313, 64, 68, 74);
lblBolinha5.setBounds(0, 120, 70, 70);
contentPane.add(lblBolinha5);

JButton btnIniciar = new JButton("Iniciar");
btnIniciar.setBounds(0, 0, 70, 70);
contentPane.add(btnIniciar);

BolinhaController bolinhaController =
new BolinhaController(lblBolinha1, lblBolinha2, lblBolinha3, lblBolinha4, lblBolinha5, btnIniciar);
btnIniciar.addActionListener(bolinhaController);
}
}