
// oppgave 1


package oblig2;

import javax.swing.*;

public class ObligT {
    public static void main(String[]args) {
        String nedre = JOptionPane.showInputDialog("Skriv inn nedre grense");
        String ovre = JOptionPane.showInputDialog("Skriv inn øvre grense");
        //int nedregrense=0;
        //int øvregrense=20;
        int nedregrense = Integer.parseInt(nedre);
        int øvregrense = Integer.parseInt(ovre);
        String utskrift = "";
        int sum = 0;
        int hei = 0;
        StringBuilder utString = new StringBuilder();

        if (øvregrense<nedregrense) {
            JOptionPane.showMessageDialog(null, "nedre grense kan ikke være større enn øvre idiot!!");
            System.exit(0);
        }

        for (int i = nedregrense; i <= øvregrense; i++) {
            sum += i;
            utString.append(i);
            if(i<øvregrense)
                utString.append("+");
            hei++;
            if(hei%10 ==0){
                utString.append("\n");
            }

        }



        //utskrift = utskrift.substring(0, utskrift.length() - 1);
        //utskrift += "\nsum = " + sum;

        System.out.println(utString+"\nsum="+sum);
        //JOptionPane.showMessageDialog(null, utskrift);
    }
}
