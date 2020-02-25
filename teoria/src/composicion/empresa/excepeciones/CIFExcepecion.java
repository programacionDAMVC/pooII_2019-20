package composicion.empresa.excepeciones;

public class CIFExcepecion extends Exception{
    @Override
    public String getMessage() {
        return "CIF no correcto";
    }
}
