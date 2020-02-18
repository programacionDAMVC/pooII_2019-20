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
                String telefonoPreparado = Utilidades.preparaTelefono(telefono);

               if (!Utilidades.esNombre(nombre))
                System.out.printf("%s nombre incorrecto%n", nombre);
               else if(!Utilidades.esTelefono(telefonoPreparado))
                    System.out.printf("%s telefono incorrecto%n", telefonoPreparado);
               else
                    agenda.annadirContacto(new Contacto(nombre, telefonoPreparado));


            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        System.out.println(agenda);
        System.out.printf("%d contactos en la agenda%n", agenda.getLista().size());
        Contacto contacto = new Contacto("","913852633");
        System.out.printf("Eliminar contacto %s, éxito %B%n",
                contacto.getNumeroTelefono(),agenda.eliminarContacto(contacto));
        System.out.printf("%d contactos en la agenda%n", agenda.getLista().size());



    }
}




