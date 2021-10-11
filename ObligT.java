
// oppgave 1


package oblig2;

import javax.swing.*;

public class ObligT {
    public static void main(String[]args) {
        String nedregrense = JOptionPane.showInputDialog("Skriv inn nedre grense");
        String øvregrense = JOptionPane.showInputDialog("Skriv inn øvre grense");
        int nedre = Integer.parseInt(nedregrense);
        int ovre = Integer.parseInt(øvregrense);
        String utskrift = "";
        int sum = 0;

        if (ovre<nedre) {
            JOptionPane.showMessageDialog(null, "nedre grense kan ikke være større enn øvre idiot!!");
            System.exit(0);
        }

        for (int i = nedre; i <= ovre; i++) {

            sum += i;
            utskrift += i + "+";

        }

        utskrift = utskrift.substring(0, utskrift.length() - 1);
        utskrift += "=" + sum;


        JOptionPane.showMessageDialog(null, utskrift);
    }
}
