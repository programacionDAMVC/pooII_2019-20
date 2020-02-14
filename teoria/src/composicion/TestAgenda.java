package composicion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda("Amigos");
        try (Scanner sc = new Scanner(new File("ficheros/datos.txt"));){
            while (sc.hasNextLine()) {
                String nombre = sc.next();
                String telefono = sc.next();

               if (Utilidades.esNombre(nombre) && Utilidades.esTelefono(telefono))
                    agenda.annadirContacto(new Contacto(nombre, telefono));

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(agenda);
        System.out.printf("%d contactos en la agenda%n", agenda.getLista().size());
        Contacto contacto = new Contacto("","913852633");
        agenda.eliminarContacto(contacto);
        System.out.printf("%d contactos en la agenda%n", agenda.getLista().size());



    }
}




