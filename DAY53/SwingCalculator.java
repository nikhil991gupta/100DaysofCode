package DAY53;

import java.awt.*;
import java.awt.event.*;

class SwingCalculator extends Frame implements ActionListener {
    Label l1, l2, l3, l4;
    TextField t1, t2;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    SwingCalculator() {
        super(" Basic Calculator");
        setLayout(null);
        setSize(500, 400);
        setVisible(true);
        l1 = new Label("Enter the first no:");
        l2 = new Label("Enter the second no:");
        l3 = new Label("Result:");
        l4 = new Label(null);
        t1 = new TextField();
        t2 = new TextField();
        b1 = new Button("ADD");
        b2 = new Button("MULTIPLY");
        b3 = new Button("DIVIDE");
        b4 = new Button("Modulus");
        b5 = new Button("POWER");
        b6 = new Button("SUBTRACT");
        b7 = new Button("PRIME");
        b8 = new Button("FACTORIAL");
        b9 = new Button("ClEAR");


        l1.setBounds(100, 50, 120, 20);
        add(l1);
        t1.setBounds(240, 50, 120, 20);
        add(t1);
        l2.setBounds(100, 80, 130, 20);
        add(l2);
        t2.setBounds(240, 80, 120, 20);
        add(t2);
        l3.setBounds(100, 110, 120, 20);
        add(l3);
        l4.setBounds(240, 130, 400, 20);
        add(l4);
        b1.setBounds(200, 150, 60, 20);
        add(b1);
        b2.setBounds(270, 150, 90, 20);
        add(b2);
        b3.setBounds(350, 150, 70, 20);
        add(b3);
        b4.setBounds(430, 150, 60, 20);
        add(b4);
        b5.setBounds(500, 150, 60, 20);
        add(b5);
        b6.setBounds(580, 150, 70, 20);
        add(b6);
        b7.setBounds(660, 150, 80, 20);
        add(b7);
        b8.setBounds(740, 150, 80, 20);
        add(b8);
        b9.setBounds(820, 150, 70, 20);
        add(b9);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);


        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        float a, b, c;
        if (ae.getSource() == b1) {
            a = Float.parseFloat(t1.getText().trim());
            b = Float.parseFloat(t2.getText().trim());
            c = a + b;
            l4.setText("Addition "+(Float.toString(c)));
        } else if (ae.getSource() == b2) {
            float d;
            a = Float.parseFloat(t1.getText().trim());
            b = Float.parseFloat(t2.getText().trim());
            d = a * b;

            l4.setText(("Multiplication "+Float.toString(d)));
        } else if (ae.getSource() == b3) {
            float e;
            a = Float.parseFloat(t1.getText().trim());
            b = Float.parseFloat(t2.getText().trim());
            e = a / b;

            l4.setText(("Division "+Float.toString(e)));
        } else if (ae.getSource() == b4) {
            float e;
            a = Float.parseFloat(t1.getText().trim());
            b = Float.parseFloat(t2.getText().trim());
            e = a % b;

            l4.setText(("Modulus "+Float.toString(e)));
        } else if (ae.getSource() == b5) {
            int e;
            int d,f;


            a = Integer.parseInt(t1.getText().trim());
            b = Integer.parseInt(t2.getText().trim());
            d=(int)a;
            f=(int)b;
            e= (int) Math.pow(d,f);

            l4.setText(("Power "+Float.toString(e)));
        } else if (ae.getSource() == b6) {
            a = Float.parseFloat(t1.getText().trim());
            b = Float.parseFloat(t2.getText().trim());
            c = a - b;
            l4.setText(("Subtraction "+Float.toString(c)));

        } else if (ae.getSource() == b7) {
            float e;
            a = Float.parseFloat(t1.getText().trim());
            if (a == 2) {
                e = a;
                l4.setText("Prime" + Float.toString(e));

            } else if (a % 2 != 0 || a > 0) {
                float flag = 0;
//                a=Float.parseFloat(t1.getText().trim());
//
//                for(int i=2;i<a;i++)
//                {
//
//                    if(a%i==0)
//                    {
//                        l4.setText(" Not Prime");
//                        //return;
//
//                    }
//                    else {
//                        l4.setText(" Prime");
//
//                        //l4.setText(Float.toString(a));
                for (int i = 2; i < a / 2; i++) {
                    if (a % i == 0) {
                        l4.setText("Not Prime");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    l4.setText("Prime");
                }

            }
        }

        else if(ae.getSource()==b8)
        {
            float e=1;
            a=Float.parseFloat(t1.getText().trim());
            for (int i=1;i<=a;i++) {

                e =e*i;


                l4.setText(("Factorial "+Float.toString(e)));
            }
        }
        else
        {
            t1.setText(null);
            t2.setText(null);
            l4.setText(null);
        }
    }

    public static void main(String s[])
    {
        SwingCalculator ob=new SwingCalculator();
    }
}
