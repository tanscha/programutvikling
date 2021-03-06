package org.openjfx.filbehandling2;

import org.openjfx.Kunde.Bestilling;
import org.openjfx.Kunde.Kunde;
import org.openjfx.komponenter.Komponent;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;


public class LagreJOBJ {

    //Metode som skriver en komponent-arrayliste til gitt jobj-fil
    public static void lagreKompTilListe(String filnavn, ArrayList<Komponent> listeinn) {
        try {
            FilesSaver saver = new FileSaverJOBJ();
            saver.save(listeinn, Paths.get("src/main/java/org/openjfx/Filer/" + filnavn));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Metode som skriver en kunde-arrayliste til gitt jobj-fil
    public static void lagreKundeTilListe(String filnavn, ArrayList<Kunde> listeinn) {
        try {
            FilesSaver saver = new FileSaverJOBJ();
            saver.save(listeinn, Paths.get("src/main/java/org/openjfx/Filer/" + filnavn));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Metode som skriver en bestilling-arrayliste til gitt jobj-fil
    public static void lagreBestillingTilListe(String filnavn, ArrayList<Bestilling> listeinn) {
        try {
            FilesSaver saver = new FileSaverJOBJ();
            saver.save(listeinn, Paths.get("src/main/java/org/openjfx/Filer/" + filnavn));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
