package teoria.clasesInternas;

public class TestClasesInternas {
    public static void main(String[] args) {
        //clase interna estática
        System.out.println( "Clase interna estática: " +
                Externa1.Interna1.concatenarAtributos());
        //clase interna de instancia
        Externa2 externa2 = new Externa2(10);
        int valorDesdeExterna = externa2.sumarAtributoInternoYExternoDesdeExterna();
        System.out.printf("Clase interna instancia %d%n", valorDesdeExterna);
        Externa2.Interna2 interna2 = externa2.new Interna2(10);
        int valorDesdeInterna = interna2.sumarAtributoInternoYExternoDesdeInterna();
        System.out.printf("Clase interna instancia %d%n", valorDesdeInterna);
        //clase externa de instancia
        Externa3 externa3 = new Externa3(2.2f);
        float valor = externa3.metodoLocal();
        System.out.printf("Clase interna local %.2f%n", valor);

        new Interfaz() {
            @Override
            public int devolverValor() {
                return 0;
            }
        };


    }
}
