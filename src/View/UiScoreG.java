package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UiScoreG extends JFrame{
	JPanel panel1;
	JPanel panel2;
	JPanel panel31;
	JPanel panel32;
	JPanel panel33;
	JPanel panel34;
	JPanel panel35;
	JPanel panel36;
	JPanel panel37;
	JPanel panel38;
	JPanel panel39;
	JPanel panel310;
	JPanel panel4;
	JPanel mainPanel3;
	JLabel head;
	JLabel g;
	JLabel grade;
	JLabel A;
	JLabel Bp;
	JLabel B;
	JLabel Cp;
	JLabel C;
	JLabel Dp;
	JLabel D;
	JLabel F;
	JLabel signA;
	JLabel signBp;
	JLabel signB;
	JLabel signCp;
	JLabel signC;
	JLabel signDp;
	JLabel signD;
	JLabel signF;
	JButton back;
	JButton save;
	JButton clear;
	JButton edit;
	JTextField txta;
	JTextField txta1;
	JTextField txtbp;
	JTextField txtbp1;
	JTextField txtb;
	JTextField txtb1;
	JTextField txtcp;
	JTextField txtcp1;
	JTextField txtc;
	JTextField txtc1;
	JTextField txtdp;
	JTextField txtdp1;
	JTextField txtd;
	JTextField txtd1;
	JTextField txtf;
	JTextField txtf1;
	
	public UiScoreG(){
		panel1 = new JPanel();
		panel1.setBackground(new Color(255,193,37));
		head = new JLabel("�ӹѡ�ҹ����¹�ѡ�֡��");
		panel2 = new JPanel();
		panel2.setBackground(new Color(255,236,139));
		back = new JButton("BACK");
		back.setBackground(new Color(255,127,0));
		mainPanel3 = new JPanel(new GridLayout(11,1));
		mainPanel3.setBackground(Color.WHITE);
		panel31 = new JPanel();
		panel31.setBackground(Color.WHITE);
		panel32 = new JPanel();
		panel32.setBackground(Color.WHITE);
		panel33 = new JPanel();
		panel33.setBackground(Color.WHITE);
		panel34 = new JPanel();
		panel34.setBackground(Color.WHITE);
		panel35 = new JPanel();
		panel35.setBackground(Color.WHITE);
		panel36 = new JPanel();
		panel36.setBackground(Color.WHITE);
		panel37 = new JPanel();
		panel37.setBackground(Color.WHITE);
		panel38 = new JPanel();
		panel38.setBackground(Color.WHITE);
		panel39 = new JPanel();
		panel39.setBackground(Color.WHITE);
		panel310 = new JPanel();
		panel310.setBackground(Color.WHITE);
		g = new JLabel("��˹�ࡳ���õѴ�ô");
		grade = new JLabel("Grade :");
		A = new JLabel("A  : ");
		txta = new JTextField(3);
		signA = new JLabel("<=");
		txta1 = new JTextField(3);
		Bp = new JLabel("B+  : ");
		txtbp = new JTextField(3);
		signBp = new JLabel("<=");
		txtbp1 = new JTextField(3);
		B = new JLabel("B  : ");
		txtb = new JTextField(3);
		signB = new JLabel("<=");
		txtb1 = new JTextField(3);
		Cp = new JLabel("C+  : ");
		txtcp = new JTextField(3);
		signCp = new JLabel("<=");
		txtcp1 = new JTextField(3);
		C = new JLabel("C  : ");
		txtc = new JTextField(3);
		signC = new JLabel("<=");
		txtc1 = new JTextField(3);
		Dp = new JLabel("D+  : ");
		txtdp = new JTextField(3);
		signDp = new JLabel("<=");
		txtdp1 = new JTextField(3);
		D = new JLabel("D  : ");
		txtd = new JTextField(3);
		signD = new JLabel("<=");
		txtd1 = new JTextField(3);
		F = new JLabel("F  : ");
		txtf = new JTextField(3);
		signF = new JLabel("<=");
		txtf1 = new JTextField(3);
		panel4 = new JPanel();
		panel4.setBackground(Color.WHITE);
		save = new JButton("SAVE");
		clear = new JButton("CLEAR");
		edit = new JButton("EDIT");
		
		panel1.add(head);
		this.add(panel1,BorderLayout.NORTH);
		
		panel2.add(back);
		this.add(panel2,BorderLayout.WEST);
		
		panel31.add(g);
		panel32.add(grade);
		panel33.add(A);
		panel33.add(txta);
		panel33.add(signA);
		panel33.add(txta1);
		panel34.add(Bp);
		panel34.add(txtbp);
		panel34.add(signBp);
		panel34.add(txtbp1);
		panel35.add(B);
		panel35.add(txtb);
		panel35.add(signB);
		panel35.add(txtb1);
		panel36.add(Cp);
		panel36.add(txtcp);
		panel36.add(signCp);
		panel36.add(txtcp1);
		panel37.add(C);
		panel37.add(txtc);
		panel37.add(signC);
		panel37.add(txtc1);
		panel38.add(Dp);
		panel38.add(txtdp);
		panel38.add(signDp);
		panel38.add(txtdp1);
		panel39.add(D);
		panel39.add(txtd);
		panel39.add(signD);
		panel39.add(txtd1);
		panel310.add(F);
		panel310.add(txtf);
		panel310.add(signF);
		panel310.add(txtf1);
		panel4.add(edit);
		panel4.add(save);
		panel4.add(clear);
		mainPanel3.add(panel31);
		mainPanel3.add(panel32);
		mainPanel3.add(panel33);
		mainPanel3.add(panel34);
		mainPanel3.add(panel35);
		mainPanel3.add(panel36);
		mainPanel3.add(panel37);
		mainPanel3.add(panel38);
		mainPanel3.add(panel39);
		mainPanel3.add(panel310);
		mainPanel3.add(panel4);
		this.add(mainPanel3,BorderLayout.CENTER);
		
		pack();
		setTitle("THAMMASAT UNIVERSITY");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UiScoreG us = new UiScoreG();
	}

}
