package teoria.composicion.empresa.excepeciones;

public class DNIExcepecion extends Exception{
    @Override
    public String getMessage() {
        return "DNI no correcto";
    }
}
