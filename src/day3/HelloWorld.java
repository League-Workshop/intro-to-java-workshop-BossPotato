package day3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("Enter your name.");
	JOptionPane.showMessageDialog(null, "Hi "+ name+"! Nice to meet you.");
	
}
}
