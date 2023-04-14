package out.com.JavaAvanzado.DesignPatterns.BehaviourPatterns.StrategyPattern;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Implementación de la Interfaz Usuarios que utiliza un fichero para almacenar usuarios.
 */

public class UsuariosFichero implements Usuarios{

    private String ficheroUsuarios = "usuarios.txt";
    private PrintStream fichero;

    public UsuariosFichero() {
        try {
            fichero = new PrintStream(ficheroUsuarios);
        } catch (Exception e) {
            System.out.println("No puedo abrirlo: " + e.getMessage());
        }
    }

    /**
     * Crea un usuario nuevo.
     *
     * @param nombre el nombre del nuevo usuario.
     */
    @Override
    public void crear(String nombre) {
        fichero.println(nombre);
    }

    /**
     *
     * @return una lista con los nombres de los usuarios.
     */
    @Override
    public ArrayList<String> listar(){
        ArrayList<String> usuarios = new ArrayList();

        try {
            Scanner scanner = new Scanner(new File(ficheroUsuarios));

            while (scanner.hasNext()) {
                usuarios.add(scanner.next());
            }

        } catch (Exception e) {
            System.out.println("Error leyendo: " + e.getMessage());
        }

        return usuarios;
    }
}
