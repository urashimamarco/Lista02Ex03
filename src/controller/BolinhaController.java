package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
public class BolinhaController implements ActionListener{
private JLabel lblBolinha1;
private JLabel lblBolinha2;
private JLabel lblBolinha3;
private JLabel lblBolinha4;
private JLabel lblBolinha5;
private JButton btnIniciar;
public BolinhaController(JLabel lblBolinha1,
JLabel lblBolinha2, JLabel lblBolinha3, JLabel lblBolinha4, JLabel lblBolinha5, JButton btnIniciar) {
this.lblBolinha1 = lblBolinha1;
this.lblBolinha2 = lblBolinha2;
this.lblBolinha3 = lblBolinha3;
this.lblBolinha4 = lblBolinha4;
this.lblBolinha5 = lblBolinha5;
this.btnIniciar = btnIniciar;
}
private void botaoBolinha(){
Thread t1 = new ThreadBolinha(lblBolinha1, btnIniciar);
Thread t2 = new ThreadBolinha(lblBolinha2, btnIniciar);
Thread t3 = new ThreadBolinha(lblBolinha3, btnIniciar);
Thread t4 = new ThreadBolinha(lblBolinha4, btnIniciar);
Thread t5 = new ThreadBolinha(lblBolinha5, btnIniciar);

t1.start();
t2.start();
t3.start();
t4.start();
t5.start();
}

@Override
public void actionPerformed(ActionEvent e) {
botaoBolinha();
}
}