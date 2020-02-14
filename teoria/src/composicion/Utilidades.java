package composicion;

public class Utilidades {
    public static boolean esNombre(String nombre){
        return nombre.toLowerCase().matches("[a-zñüáéíóú\\s]+");
    }
    public static boolean esTelefono(String telefono) {
        String tef = telefono.trim().replaceAll("\\s+","");
        return tef.matches("^[6-9][0-9]{8}$");
    }
}
