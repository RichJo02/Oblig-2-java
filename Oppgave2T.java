
package oblig2;
import static javax.swing.JOptionPane.*;

class Tallspill
{
    public int nyttTall() {
        // Trekker og returnerer et slumptall mellom 0 og 200.

        // Tips bruk :(Math.random() * 201), som gir verdier mellom 0 og 200
        int number = (int)(201
                * Math.random());
        return number;
    }

    public void visMelding(String melding){
        // Viser parameterens innhold i en meldingsboks.
        showMessageDialog(null,melding);
    }

    private void forLite(int tall){
    /* Viser melding om at parameterens verdi er for
       lite tall og ber spilleren prøve igjen. */
        String melding = tall + " er for lite, prøv igjen!";
        visMelding(melding);
    }

    private void forStort(int tall) {
    /* Viser melding om at parameterens verdi er for
      stort tall og ber spilleren prøve igjen. */
        String melding = tall + " er for stort, prøv igjen!";
        visMelding(melding);
    }


    public void avsluttRunde(int antall, int gjetning) {
    /* Viser melding om at det ble gjettet riktig
      og antall gjetninger som ble brukt.
      Parametrene gir opplysninger om dette. */


        if (antall == gjetning) {
            System.out.println(
                    "Gratulerer!"
                            + gjetning + " er rett tall."
                            + "Du har brukt" + antall
                            + "forsøk");

        }

    }

    public void kjørSpill() {
    /* Kjører en spillrunde ved å trekke et tall,
      nullstille tellevariabel, innhente gjentatte
      gjetninger fra bruker inntil det gjettes riktig.
      Når det skjer, avsluttes runden med passe
      meldinger til spilleren. */

        int nyttTall = nyttTall();
        int gjetning = 0;
        int antall = 1;

        do{
            String inn = showInputDialog("tipp tallet");
            gjetning = Integer.parseInt(inn);

            if(gjetning < nyttTall){
                forLite(gjetning);
                antall++;
            }
            if(gjetning > nyttTall){
                forStort(gjetning);
                antall++;
            }

        }
        while(gjetning != nyttTall);

    }
}

