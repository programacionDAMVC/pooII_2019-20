package composicion.empresa.excepeciones;

public class FechaNacimientoExcepcion extends Exception{
    @Override
    public String getMessage() {
        return "Fecha nacimiento no correcta";
    }
}
