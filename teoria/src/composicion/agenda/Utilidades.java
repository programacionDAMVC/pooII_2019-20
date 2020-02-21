package composicion.agenda;

public class Utilidades {
    public static boolean esNombre(String nombre){
        return nombre.toLowerCase().matches("[a-zñüáéíóú\\s]+");
    }
    public static boolean esTelefono(String telefono) {
        return telefono.matches("^[6-9][0-9]{8}$");
    }
    public static String preparaTelefono (String telefono) {
        return telefono.trim().replaceAll("\\s+","");
    }
}
