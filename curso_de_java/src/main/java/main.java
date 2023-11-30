import domain.Usuario;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el nombre del usuario: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el apellido del usuario: ");
            String apellido = sc.nextLine();
            System.out.println("Ingrese la ciudad del usuario: ");
            String ciudad = sc.nextLine();
            System.out.println("Ingrese la edad del usuario: ");
            int edad = Integer.parseInt(sc.nextLine());
            sc.close();
            Usuario usuario = new Usuario(nombre, apellido, ciudad, edad);
            System.out.println(usuario.toString());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
