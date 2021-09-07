/*package Exercicios.FuncRadio.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

class RadioPrestacao extends JFrame implements ItemListener
{
    double n1=0, total=0, valores=0;
    JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9;
    JLabel label10;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9;
    JPanel p1, p2;
    JRadioButton radio1, radio2, radio3, radio4;
    ButtonGroup radiogroup;

    public static void main(String[] args) {
        JFrame janela=new RadioPrestacao();
        janela.setVisible(true);
        janela.setUndecorated(true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    }

    RadioPrestacao()
    {
        setTitle("BANCO DINHEIRO VIVO-SOLICITAÇÃO DE EMPRESTIMOS");

        setBounds(0,0,1024,500);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));

        label1=new JLabel("Nome:");
        label1.setForeground(Color.BLUE);
        label2=new JLabel("RG:");
        label2.setForeground(Color.BLUE);
        label3=new JLabel("CPF:");
        label3.setForeground(Color.BLUE);
        label4=new JLabel("Endereço:");
        label4.setForeground(Color.BLUE);
        label5=new JLabel("Telefone:");
        label5.setForeground(Color.BLUE);
        label6=new JLabel("Cidade:");
        label6.setForeground(Color.BLUE);
        label7=new JLabel("Valor do empréstimo:        R$");
        label7.setForeground(Color.BLUE);
        label7=new JLabel("Valor do total a ser pago:      R$");
        label7.setForeground(Color.BLUE);
        label9=new JLabel("Valor da prestação em R$: ");
        label9.setForeground(Color.BLUE);

        t1=new JTextField(30);
        t2=new JTextField(10);
        t3=new JTextField(10) ;
        t4=new JTextField(20);
        t5=new JTextField(10);
        t6=new JTextField(15);
        t7=new JTextField(10);
        t8=new JTextField(15);
        t8.setEditable(false);
        t9=new JTextField(15);
        t9.setEditable(false);

        p1= new JPanel();
        p2= new JPanel();

        radio1= new JRadioButton("Pgto em 6x");;
        radio2= new JRadioButton("Pgto em 12x");
        radio3= new JRadioButton("Pgto em 18x");
        radio4= new JRadioButton("Pgto em 24");
        radio1.setMnemonic(KeyEvent.VK_6);
        radio1.setMnemonic(KeyEvent.VK_2);
        radio1.setMnemonic(KeyEvent.VK_8);
        radio1.setMnemonic(KeyEvent.VK_4);

        radiogroup= new ButtonGroup();
        radiogroup.add(radio1);     radio1.addItemListener(this);
        radiogroup.add(radio2);     radio2.addItemListener(this);
        radiogroup.add(radio3);     radio3.addItemListener(this);
        radiogroup.add(radio4);     radio4.addItemListener(this);

        p1.setLayout(new GridLayout(7,2));
        p1.setBackground(new Color(250,155,69,200));

        p2.setLayout(new GridLayout(4,2));
        p2.setBackground(new Color(234,232,149,120));

        p1.add(label1);p1.add(t1);
        p1.add(label2);p1.add(t2);
        p1.add(label3);p1.add(t3);
        p1.add(label4);p1.add(t4);
        p1.add(label5);p1.add(t5);
        p1.add(label6);p1.add(t6);
        p1.add(label7);p1.add(t7);}}

*/