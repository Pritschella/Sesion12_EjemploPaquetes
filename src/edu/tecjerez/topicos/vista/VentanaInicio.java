package edu.tecjerez.topicos.vista;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

import edu.tecjerez.topicos.geometria.Punto;

@SuppressWarnings("serial")
public class VentanaInicio extends JFrame implements ActionListener, KeyListener{
	
	JTextField txtFP1X, txtFP1Y, txtFP2X, txtFP2Y, txtFP3X, txtFP3Y, txtFArea;
	JButton btnCalcular, btnBorrar;
	
	public VentanaInicio() {
	
		getContentPane().setLayout(new FlowLayout());
		setTitle("Ventana inicio");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
		JLabel separador1=new JLabel("    ");
		add(separador1);
		
		JLabel lblcoordenada1=new JLabel("Coordenada 1  ");
		add(lblcoordenada1);
		
		JLabel lblcoordenada1X=new JLabel("X: ");
		add(lblcoordenada1X);
		txtFP1X=new JTextField(5);
			txtFP1X.setHorizontalAlignment(JTextField.CENTER);
			txtFP1X.addKeyListener(this);
		add(txtFP1X);
		
		JLabel lblcoordenada1Y=new JLabel(" Y: ");
		add(lblcoordenada1Y);
		txtFP1Y=new JTextField(5);
			txtFP1Y.setHorizontalAlignment(JTextField.CENTER);
			txtFP1Y.addKeyListener(this);
		add(txtFP1Y);
		
		
		JLabel separador2=new JLabel("     ");
		add(separador2);
		
		JLabel lblcoordenada2=new JLabel("Coordenada 2  ");
		add(lblcoordenada2);
		
		JLabel lblcoordenada2X=new JLabel("X: ");
		add(lblcoordenada2X);
		txtFP2X=new JTextField(5);
			txtFP2X.setHorizontalAlignment(JTextField.CENTER);
			txtFP2X.addKeyListener(this);
		add(txtFP2X);
		
		JLabel lblcoordenada2Y=new JLabel(" Y: ");
		add(lblcoordenada2Y);
		txtFP2Y=new JTextField(5);
			txtFP2Y.setHorizontalAlignment(JTextField.CENTER);
			txtFP2Y.addKeyListener(this);
		add(txtFP2Y);
		
		
		JLabel separador3=new JLabel("      ");
		add(separador3);
		
		JLabel lblcoordenada3=new JLabel("Coordenada 3  ");
		add(lblcoordenada3);
		
		JLabel lblcoordenada3X=new JLabel("X: ");
		add(lblcoordenada3X);
		txtFP3X=new JTextField(5);
			txtFP3X.setHorizontalAlignment(JTextField.CENTER);
			txtFP3X.addKeyListener(this);
		add(txtFP3X);
		
		JLabel lblcoordenada3Y=new JLabel(" Y: ");
		add(lblcoordenada3Y);
		txtFP3Y=new JTextField(5);
			txtFP3Y.setHorizontalAlignment(JTextField.CENTER);
			txtFP3Y.addKeyListener(this);
		add(txtFP3Y);
		
		JLabel separador4=new JLabel("   ");
		add(separador4);
		
		txtFArea=new JTextField(10);
		add(txtFArea);
		
		JLabel separador5=new JLabel("    ");
		add(separador5);
		
		btnCalcular=new JButton("Calcular");
		add(btnCalcular);
		
		btnBorrar=new JButton("Borrar");
			btnBorrar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					txtFP1X.setText("");
					txtFP1Y.setText("");
					txtFP2X.setText("");
					txtFP2Y.setText("");
					txtFP3X.setText("");
					txtFP3Y.setText("");
					txtFArea.setText("");
					
					btnCalcular.setEnabled(false);
				}
			});
		add(btnBorrar);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Punto objecto1 = new Punto();
		
		//PuntoPrueba obj2 = new PuntoPrueba();
		
		/*
		 * No se puede usar la calse PuntoPrueba ya que no 
		 * es publico y ademas esta en otro paquete. 
		 */
		
		//objecto1.obtenerDistancia(new Punto(), new Punto());
		
		//PuntoPrueba obj2=new PuntoPrueba(); No se puede
		
		if(!txtFP1X.getText().isEmpty() && !txtFP1Y.getText().isEmpty()  &&
				!txtFP2X.getText().isEmpty()  && !txtFP2Y.getText().isEmpty()  &&
				!txtFP3X.getText().isEmpty()  && !txtFP3Y.getText().isEmpty() ){
			txtFArea.setEditable(true);
			if(!txtFArea.getText().isEmpty()) {
				btnCalcular.setEnabled(true);
			}
		}
		else
			btnCalcular.setEnabled(false);
		
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {}

	@Override
	public void keyReleased(KeyEvent arg0) {}
		

	@Override
	public void keyTyped(KeyEvent arg0) {}
	
}//Clase ventanaInicio
