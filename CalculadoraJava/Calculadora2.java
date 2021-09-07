package Exercicios.CalculadoraJava;//Calculadora
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculadora extends JFrame implements ActionListener
{
		JLabel label1,label2,label3;
		JButton b1, b2, b3, b4, b5, b6, b7, b8;
		JTextField t1, t2, t3;

	public static void main (String[]args){

		JFrame janela=new Calculadora();
		janela.setUndecorated(true);
		janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);

	}

Calculadora()
{
	setTitle("Calculadora");
	setBounds(100,90,350,100);
	getContentPane().setBackground(new Color(255,255,255));
	getContentPane().setLayout(new GridLayout(4,4));

	label1=new JLabel("Número 1");
	label1.setFont(new Font("",Font.BOLD,14));

	label2=new JLabel("Número 2");
	label2.setFont(new Font("",Font.BOLD,14));

	label3=new JLabel("Total");
	label3.setFont(new Font("",Font.BOLD,14));

	b1=new JButton("+");              b1.addActionListener(this);
	b2=new JButton("-");              b2.addActionListener(this);
	b3=new JButton("x");              b3.addActionListener(this);
	b4=new JButton("/");              b4.addActionListener(this);
	b5=new JButton("Limpar");         b5.addActionListener(this);
    b6=new JButton("Raiz de N2");         b6.addActionListener(this);
    b7=new JButton("N2 elevado a 2");         b7.addActionListener(this);
    b8=new JButton("N2 elevado a 3");         b8.addActionListener(this);
	b5.setBackground(Color.black);
	b5.setBackground(Color.white);

	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	t3.setEditable(false);

	getContentPane().add(label1);
	getContentPane().add(t1);
	getContentPane().add(b1);
	getContentPane().add(b2);

	getContentPane().add(label2);
	getContentPane().add(t2);
	getContentPane().add(b3);
	getContentPane().add(b4);

	getContentPane().add(label3);
	getContentPane().add(t3);
	getContentPane().add(b5);
    getContentPane().add(b6);
    getContentPane().add(b7);
    getContentPane().add(b8);
}

public void actionPerformed(ActionEvent e)
{
	if (e.getSource()==b5)
	{
		t1.setText("");
		t2.setText("");
		t3.setText("");
		return;
	}
	double n1=0, n2=0, result= 0;

	try
	{
		n1=Double.parseDouble(t1.getText());
		n2=Double.parseDouble(t2.getText());
	}
				catch(NumberFormatException erro)
				{
					t3.setText("Erro");
					return;
}

	if (e.getSource()==b1)
		result=n1+n2;
	if (e.getSource()==b2)
		result=n1-n2;
	if (e.getSource()==b3)
		result=n1*n2;
	if (e.getSource()==b4)
		result=n1/n2;
	if (e.getSource()==b6)
		result= (float) Math.sqrt(n2);
	if (e.getSource()==b7)
		result= Math.pow(n2,2);
	if (e.getSource()==b8)
		result= Math.pow(n2,3);

	t3.setText(""+result);



}}