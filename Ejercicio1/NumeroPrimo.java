package out.com.JavaAvanzado.Ejercicios.Ejercicios1213y14.FuncionesLimpias;

public class NumeroPrimo {
    /**
     * Determina si es un número primo.
     * 
     * @param numero el número a evaluar
     * @return true si es primo, false si no es primo.
     * @throws IllegalArgumentException si el número es igual o menor que 1.
     */
    public static boolean esPrimo(int numero) {

        if (numero <= 1) {
            throw new IllegalArgumentException("El número debe ser mayor que 1");
        }

        final int limite = (int) Math.sqrt(numero);
        for (int i = 2; i <= limite; i++) {

            if (numero % i == 0){
                return false;
            }
        }
        return true;

    }
    
}
