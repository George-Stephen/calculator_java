package com.infinity;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterFrame extends JFrame implements ActionListener{
    private JTextField txtFname,textLname,textAdmn,txtCourse;
    private JLabel lblMessage;
    private JButton btnRegister;

    public RegisterFrame(){
        super("Registration");
        setLayout(new FlowLayout());
        lblMessage = new JLabel("Add names \n");
        add(lblMessage);
        textAdmn = new JTextField(15);
        add(textAdmn);
        txtFname = new JTextField(15);
        add(txtFname);
        textLname = new JTextField(15);
        add(textLname);
        txtCourse = new JTextField(15);
        add(txtCourse);

        btnRegister = new JButton("Register");
        btnRegister.addActionListener(this);
        add(btnRegister);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegister) {
            String admNo = textAdmn.getText();
            String fname = txtFname.getText();
            String lname = textLname.getText();
            String course = txtCourse.getText();
            if (fname.equals("") || lname.equals("")){
                JOptionPane.showMessageDialog(null, "Registration unsuccessful", "Error", JOptionPane.PLAIN_MESSAGE);
            }else{
                Student student = new Student(admNo,fname,lname,course);
                lblMessage.setText("Welcome " + student.getAdmission_number() + " " + student.getFname() +"." );
                JOptionPane.showMessageDialog(null, "Registration successful", "Success", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
}
