package com.infinity;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame implements ActionListener {
    private JTextField num1;
    private  JButton n_0,n_1,n_2,n_3,n_4,n_5,n_6,n_7,n_8,n_9,calculate,b_sum,b_minus,b_div,b_multiply,clear,sqrt,sqr;
    private String str_1,str_2,str_3;

    public CalculatorFrame() {
        super("Calculator");
        str_1 =str_2= str_3 = "";
        setLayout(new FlowLayout());
        num1 = new JTextField(30);
        num1.setEditable(false);
        add(num1);
        GridLayout gridLayout = new GridLayout(0,2);
        setLayout(gridLayout);
        n_1 = new JButton("1");
        n_1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (str_2.equals("")){
                            str_1 = str_1+"1";
                            num1.setText(str_1);
                        } else {
                            str_3 = str_3+"1";
                            num1.setText(str_1+str_2+str_3);
                        }
                    }
                }
        );
        add(n_1);
        n_2 = new JButton("2");
        n_2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (str_2.equals("")){
                            str_1 = str_1+"2";
                            num1.setText(str_1);
                        } else {
                            str_3 = str_3+"2";
                            num1.setText(str_1+str_2+str_3);
                        }
                    }
                }
        );
        add(n_2);
        n_3 = new JButton("3");
        n_3.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (str_2.equals("")){
                            str_1 = str_1+"3";
                            num1.setText(str_1);
                        } else {
                            str_3 = str_3+"3";
                            num1.setText(str_1+str_2+str_3);
                        }

                    }
                }
        );
        add(n_3);
        n_4 = new JButton("4");
        n_4.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (str_2.equals("")){
                            str_1 = str_1+"4";
                            num1.setText(str_1);
                        } else {
                            str_3 = str_3+"4";
                            num1.setText(str_1+str_2+str_3);
                        }
                    }
                }
        );
        add(n_4);
        n_5 = new JButton("5");
        n_5.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (str_2.equals("")){
                            str_1 = str_1+"5";
                            num1.setText(str_1);
                        } else {
                            str_3 = str_3+"5";
                            num1.setText(str_1+str_2+str_3);
                        }
                    }
                }
        );
        add(n_5);
        n_6 = new JButton("6");
        n_6.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (str_2.equals("")){
                            str_1 = str_1+"6";
                            num1.setText(str_1);
                        } else {
                            str_3 = str_3+"6";
                            num1.setText(str_1+str_2+str_3);
                        }
                    }
                }
        );
        add(n_6);
        n_7 = new JButton("7");
        n_7.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (str_2.equals("")){
                            str_1 = str_1+"7";
                            num1.setText(str_1);
                        } else {
                            str_3 = str_3+"7";
                            num1.setText(str_1+str_2+str_3);
                        }
                    }
                }
        );
        add(n_7);
        n_8 = new JButton("8");
        n_8.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (str_2.equals("")){
                            str_1 = str_1+"8";
                            num1.setText(str_1);
                        } else {
                            str_3 = str_3+"8";
                            num1.setText(str_1+str_2+str_3);
                        }

                    }
                }
        );
        add(n_8);
        n_9 = new JButton("9");
        n_9.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (str_2.equals("")){
                            str_1 = str_1+"9";
                            num1.setText(str_1);
                        } else {
                            str_3 = str_3+"9";
                            num1.setText(str_1+str_2+str_3);
                        }

                    }
                }
        );
        add(n_9);
        n_0 = new JButton("0");
        n_0.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (str_2.equals("")){
                            str_1 = str_1+"0";
                            num1.setText(str_1);
                        } else {
                            str_3 = str_3+"0";
                            num1.setText(str_1+str_2+str_3);
                        }
                    }
                }
        );
        add(n_0);
        b_sum  = new JButton("+");
        b_sum.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        str_2 = "+";
                        num1.setText(str_1 + str_2);
                    }
                }
        );
        add(b_sum);
        b_minus  = new JButton("-");
        b_minus.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        str_2 = "-";
                        num1.setText(str_1 + str_2);
                    }
                }
        );
        add(b_minus);
        b_div  = new JButton("/");
        b_div.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        str_2 ="/";
                        num1.setText(str_1 + str_2);
                    }
                }
        );
        add(b_div);
        b_multiply = new JButton("*");
        b_multiply.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        str_2 = "*";
                        num1.setText(str_1 + str_2);
                    }
                }
        );
        add(b_multiply);
        sqr = new JButton("Sqr");
        sqr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str_2 = "sqr ";
                num1.setText(str_2 +str_3);
            }
        });
        add(sqr);
        sqrt = new JButton("Sqrt");
        sqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str_2 = "sqrt ";
                num1.setText(str_2+str_3);
            }
        });
        add(sqrt);
        clear = new JButton("C");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str_1 = str_2 = str_3 ="";
                num1.setText("");
            }
        });
        add(clear);
        calculate = new JButton("=");
        calculate.addActionListener(this);
        add(calculate);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (str_1.equals("")){
            int no_1 = Integer.parseInt(str_3);
            if (str_2.equals("sqr ")){
                double sqr = Math.pow(no_1,2);
                num1.setText(str_2 + String.valueOf(no_1) + " = " + String.valueOf(sqr));
            }else if (str_2.equals("sqrt ")){
                double sqr_t = Math.sqrt(no_1);
                num1.setText(str_2 + String.valueOf(no_1) + " = " + String.valueOf(sqr_t));
            }
        }else{
            int no_1 = Integer.parseInt(str_1);
            int no_2 = Integer.parseInt(str_3);
            switch (str_2) {
                case "+":
                    int sum = Math.addExact(no_1, no_2);
                    num1.setText(String.valueOf(no_1) + str_2 + String.valueOf(no_2) + " = " + String.valueOf(sum));
                    break;
                case "-":
                    int difference = Math.subtractExact(no_1, no_2);
                    num1.setText(String.valueOf(no_1) + str_2 + String.valueOf(no_2) + " = " + String.valueOf(difference));
                    break;
                case "*":
                    int product = Math.multiplyExact(no_1, no_2);
                    num1.setText(String.valueOf(no_1) + str_2 + String.valueOf(no_2) + " = " + String.valueOf(product));

                    break;
                case "/":
                    float divident = Math.floorDiv(no_1, no_2);
                    num1.setText(String.valueOf(no_1) + str_2 + String.valueOf(no_2) + " = " + String.valueOf(divident));
                    break;
            }
        }
    }
}
