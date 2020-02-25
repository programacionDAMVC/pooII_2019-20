package clasesInternas;

public class Externa1 {
    private String atributoExternoInstancia;
    private static String atributoExternoDeClase = "externo estático";

    public Externa1(String atributo) {
        this.atributoExternoInstancia = atributo;
    }

    public  String getAtributoExterno() {
        return atributoExternoInstancia ;
    }
    public static class Interna1 {
        private static String atributoInterno = "interno estático";

        public static String getAtributoInterno() {
            return atributoInterno;
        }
        public static String concatenarAtributos() {
            return atributoInterno + atributoExternoDeClase;
        }
    }
}
