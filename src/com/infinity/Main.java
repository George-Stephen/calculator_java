package com.infinity;
import javax.swing.*;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String Num1 = JOptionPane.showInputDialog("Enter the 1st Number");
//        String Num2 = JOptionPane.showInputDialog("Enter the 2nd Number");
//        int number_1= Integer.parseInt(Num1);
//        int number_2= Integer.parseInt(Num2);
//        int result = number_1 +  number_2;
//        String message = "The addition result is " + result;
//        JOptionPane.showMessageDialog(null,message);
        CalculatorFrame registerFrame = new CalculatorFrame();
        try {
            // set look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
        registerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registerFrame.setSize(300,300);
        registerFrame.setVisible(true);
    }
}
