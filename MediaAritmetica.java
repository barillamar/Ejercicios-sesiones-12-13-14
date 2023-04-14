package out.com.JavaAvanzado.Ejercicios.Ejercicios1213y14.FuncionesLimpias;

public class MediaAritmetica {

    /**
     * Calcula la media aritmética de los números de un arreglo.
     * @param numeros el array de numeros a procesar.
     * @return la media aritmetica de los números en el array, o 0 si el array está vacío.
     * @throws IllegalArgumentException si el array es nulo.
     */

    public static double calcularMediaAritmetica(int []numeros){

        if (numeros == null) {
            throw new IllegalArgumentException("El array no puede ser nulo");
        }

        if (numeros.length == 0) {
            return 0;
        }

        int suma = 0;
        for (int numero : numeros) {
            suma += numero;

        }
        return (double) suma / numeros.length;
    }

}
