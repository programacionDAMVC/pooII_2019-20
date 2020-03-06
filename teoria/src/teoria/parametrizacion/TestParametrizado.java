package teoria.parametrizacion;

import java.time.LocalDate;
import java.util.Random;

public class TestParametrizado {
    public static void main(String[] args) {
        ClaseParametrizada<String> cPstring = new ClaseParametrizada();
        cPstring.annadirObjeto("hola");
        cPstring.annadirObjeto("hi");
        cPstring.annadirObjeto("hello");
        cPstring.annadirObjeto("bye");
        cPstring.annadirObjeto("adios");
        System.out.println("Mostrando cadenas");
        System.out.println(cPstring);

        ClaseParametrizada<Integer> cPint = new ClaseParametrizada();
        for (int i = 0; i < 10; i++) {
            cPint.annadirObjeto(new Random().nextInt(100));
        }
        System.out.println("\n\nMostrando enteros");
        System.out.println(cPint);

        ClaseParametrizada<Persona> cPpers = new ClaseParametrizada<>();
        cPpers.annadirObjeto(new Persona(
                "pedro pérez", LocalDate.of(1999, 10, 1)));
        cPpers.annadirObjeto(new Persona(
                "angustia pérez", LocalDate.of(2000, 1, 11)));
        cPpers.annadirObjeto(new Persona(
                "pedro pérez", LocalDate.of(2010, 12, 31)));
        System.out.println("\n\nMostrando personas");
        System.out.println(cPpers);

    }
}
