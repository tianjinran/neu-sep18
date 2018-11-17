

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class calculator extends JFrame implements ActionListener {
    // create a frame
    static JFrame f;

    // create a textfield
    static JTextField l;

    // store oprerator and operands
    String s0, s1, s2;

    // default constrcutor
    calculator()
    {
        s0 = s1 = s2 = "";
    }

    // main function
    public static void main(String args[])
    {
        // create a frame
        f = new JFrame("calculator");

        // create a object of class
        calculator c = new calculator();

        // create a textfield
        l = new JTextField(16);

        // set the textfield to non editable
        l.setEditable(false);

        // create number buttons and some operators
        JButton button0, button1, button2, button3, button4, button5, button6, button7,
                button8, button9, buttonadd, buttonsub, buttondiv, buttonmul, buttondot, buttonC, buttoncompute;

        // create number buttons
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");

        // equals button
        buttoncompute = new JButton("=");

        // create operator buttons
        buttonadd = new JButton("+");
        buttonsub = new JButton("-");
        buttondiv = new JButton("/");
        buttonmul = new JButton("*");
        buttonC = new JButton("C");

        // create . button
        buttondot = new JButton(".");

        // create a panel
        JPanel p = new JPanel();

        // add action listeners
        buttonmul.addActionListener(c);
        buttondiv.addActionListener(c);
        buttonsub.addActionListener(c);
        buttonadd.addActionListener(c);
        button9.addActionListener(c);
        button8.addActionListener(c);
        button7.addActionListener(c);
        button6.addActionListener(c);
        button5.addActionListener(c);
        button4.addActionListener(c);
        button3.addActionListener(c);
        button2.addActionListener(c);
        button1.addActionListener(c);
        button0.addActionListener(c);
        buttondot.addActionListener(c);
        buttonC.addActionListener(c);
        buttoncompute.addActionListener(c);

        // add elements to panel
        p.add(l);

        p.add(button1);
        p.add(button2);
        p.add(button3);
        p.add(buttonadd);

        p.add(button4);
        p.add(button5);
        p.add(button6);
        p.add(buttonsub);

        p.add(button7);
        p.add(button8);
        p.add(button9);
        p.add(buttonmul);

        p.add(buttondot);
        p.add(button0);
        p.add(buttonC);
        p.add(buttondiv);
        p.add(buttoncompute);

        // set Background of panel
        p.setBackground(Color.black);

        // add panel to frame
        f.add(p);

        f.setSize(200, 220);
        f.show();
    }
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();

        // if the value is a number
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            // if operand is present then add to second no
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;

            // set the value of text
            l.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == 'C') {
            // clear the one letter
            s0 = s1 = s2 = "";

            // set the value of text
            l.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == '=') {

            double te;

            // store the value in 1st
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));

            // set the value of text
            l.setText(s0 + s1 + s2 + "=" + te);

            // convert it to string
            s0 = Double.toString(te);

            s1 = s2 = "";
        }
        else {
            // if there was no operand
            if (s1.equals("") || s2.equals(""))
                s1 = s;
                // else evaluate
            else {
                double te;

                // store the value in 1st
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));

                // convert it to string
                s0 = Double.toString(te);

                // place the operator
                s1 = s;

                // make the operand blank
                s2 = "";
            }

            // set the value of text
            l.setText(s0 + s1 + s2);
        }
    }
}
