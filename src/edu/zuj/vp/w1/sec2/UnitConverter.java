package edu.zuj.vp.w1.sec2;

import javax.swing.JOptionPane;

public class UnitConverter {

    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog(null, "Enter a number:");
        double number = Double.parseDouble(a);

        StringBuffer buffer = new StringBuffer();
        buffer.append("Choose conversion method:\n");
        buffer.append("1- CM to Inch\n");
        buffer.append("2- Inch to CM\n");
        buffer.append("3- Feet to Meter\n");
        buffer.append("4- Meter to Feet\n");
        buffer.append("5- Dunam to Hektar\n");
        buffer.append("6- Hektar to Dunam\n");
        buffer.append("7- Fahrenheit to Celsius\n");
        buffer.append("8- Celsius to Fahrenheit\n");

        String strunit = JOptionPane.showInputDialog(null, buffer.toString());
        int unit = Integer.parseInt(strunit);

        switch (unit) {
            case 1:
                JOptionPane.showMessageDialog(null, "The result is: " + (number / 2.54));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "The result is: " + (number * 2.54));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "The result is: " + (number * 0.3048));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "The result is: " + (number / 0.3048));
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "The result is: " + (number / 10.0));
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "The result is: " + (number * 10.0));
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "The result is: " + ((number - 32) / 1.8));
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "The result is: " + ((number * 1.8) + 32));
                break;

            default:
                JOptionPane.showMessageDialog(null, "Option not found");
                System.exit(0);
        }

        System.exit(0);
    }
}
