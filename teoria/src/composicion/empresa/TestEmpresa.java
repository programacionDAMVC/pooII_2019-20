package composicion.empresa;

import composicion.empresa.excepeciones.CIFExcepecion;
import composicion.empresa.excepeciones.DNIExcepecion;
import composicion.empresa.excepeciones.FechaNacimientoExcepcion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestEmpresa {
    public static void main(String[] args) {
        Empresa empresa = null;
        try {
            empresa = new Empresa("s12345678","IES Virgen del Carmen" );
            Trabajador t1 = new Trabajador("12345678a", "juan lendinez",
                    "10-10-2000");
            empresa.annadirTrabajador(t1);
            Trabajador t2 = new Trabajador("12345679a", "juan pérez",
                    "10-10-1995");
            empresa.annadirTrabajador(t2);
            Trabajador t3 = new Trabajador("12345676a", "juani pérez",
                    "12-10-1999");
            empresa.annadirTrabajador(t3);
            System.out.println(empresa);
        } catch (CIFExcepecion | DNIExcepecion | FechaNacimientoExcepcion excepcion) {
           // cifExcepecion.printStackTrace();
            System.out.println(excepcion.getMessage());
        }


        try {
            if (empresa.existeTrabajador(new Trabajador(
                    "12345676a", null,
                    "01-01-1000")));
            {
                System.out.printf("Existe trabajador%n");
                System.out.printf("TRABAJADOR %s%n", empresa.buscarTrabajador("12345676a"));
                System.out.println("Borrando trabajador");
                System.out.printf("EXITO: %B%n", empresa.eliminarTrabajador(new Trabajador(
                        "12345676a", null,
                        "01-01-1000")));
            }
        } catch (DNIExcepecion dniExcepecion) {
            dniExcepecion.printStackTrace();
        } catch (FechaNacimientoExcepcion fechaNacimientoExcepcion) {
            fechaNacimientoExcepcion.printStackTrace();
        }



    }

}
