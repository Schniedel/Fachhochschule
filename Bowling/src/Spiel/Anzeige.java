package Spiel;

import javax.swing.JApplet;
import javax.swing.JLabel;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;

public class Anzeige extends JApplet {
	
	
	 public Frame[] F = new Frame[10];
	 public String s;
	 private JTable table;
	 DefaultTableModel tab = new DefaultTableModel(4,21); 
	 private String[] Bowler = {"Yvonne","Aylin","Daniel","Manuel","Jupp","Uwe"};
	 
	 
	public Anzeige() {
		getContentPane().setLayout(null);
		
		
		
		for (int i=0;i<F.length;i++){
			F[i] = new Frame(i);
		}
		
		JLabel lblSpieler = new JLabel("Spieler");
		lblSpieler.setBounds(0, 0, 175, 70);
		
		JComboBox Spieler1 = new JComboBox(Bowler);
		Spieler1.setBounds(10, 110, 105, 43);
		
		JLabel label = new JLabel("");
		label.setBounds(396, 76, 315, 70);
		
		JComboBox Spieler2 = new JComboBox(Bowler);
		Spieler2.setBounds(10, 159, 105, 38);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(250, 250, 315, 70);
		
		JComboBox Spieler3 = new JComboBox(Bowler);
		Spieler3.setBounds(10, 203, 105, 41);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(250, 325, 315, 75);
		
		getContentPane().add(lblSpieler);
		getContentPane().add(label_2);
		getContentPane().add(Spieler3);
		getContentPane().add(Spieler2);
		getContentPane().add(Spieler1);
		getContentPane().add(label);
		getContentPane().add(label_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(151, 81, 289, 208);
		getContentPane().add(scrollPane);
		
		table = new JTable(tab);
		table.setRowHeight(50);		
		scrollPane.setViewportView(table);
		
		
	}
}
