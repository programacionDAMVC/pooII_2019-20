package ejercicios.ejercicio2;

public class Auxiliar {
    public static boolean validarTarjeta (String tarjeta) { // 1,2 .... 16 cifras
        if (!tarjeta.matches("[0-9]{16}"))
            return false;  //no son 16 dígitos que es lo que forma una tarjeta
        int suma = 0;

        for (int i= 0; i < tarjeta.length() - 1; i++ ){
            if (i % 2 == 0) {
                int tmp = Integer.parseInt(tarjeta.charAt(i) + "") * 2;
                if (tmp >= 10)
                    suma +=  tmp - 9;
                else
                    suma += tmp;
            }
            else
                suma += Integer.parseInt(
                        tarjeta.charAt(i) + "");
        }
        int digitoControl = suma % 10;
        return Integer.parseInt(tarjeta.charAt(tarjeta.length() -1) + "")
                == digitoControl;
    }
}
