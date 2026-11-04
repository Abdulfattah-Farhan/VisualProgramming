package edu.zuj.vp.w1.sec2;

import javax.swing.JOptionPane;

public class VisualProgramming {

    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog(null, "Enter the Value");
        int number = Integer.parseInt(a);

        StringBuffer buffer = new StringBuffer();
        buffer.append("Choose the conversion method\n");
        buffer.append("1: f to cel \n");
        buffer.append("2: cel to f \n");

        String strb = JOptionPane.showInputDialog(null, buffer.toString());
        int b = Integer.parseInt(strb);

        switch (b) {

            case 1:
                JOptionPane.showMessageDialog(null, "the resulte :" + ((number - 32) * 5 / 9));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "the resulte :" + ((number * 9 / 5) + 32));
                break;
            default:
                JOptionPane.showMessageDialog(null, "error");
                System.exit(0);

        }
        System.exit(0);

    }

}
