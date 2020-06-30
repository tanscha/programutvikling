package org.openjfx.filbehandling2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Path;
import java.util.ArrayList;

public class FileSaverJOBJ implements FilesSaver { // For å lagre til serialiserbart filformat
    @Override
    public void save(ArrayList<? extends Serializable> komponentliste, Path path) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(String.valueOf(path), true);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(komponentliste);
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException("Filen kunne ikke lagres");
        }
    }
}
