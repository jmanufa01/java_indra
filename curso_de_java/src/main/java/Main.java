import domain.Empleado;
import domain.Horario;
import domain.Posicion;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            final var empleados = new ArrayList<Empleado>();
            final var sc = new Scanner(System.in);
            for(int i=0; i< Posicion.values().length; i++){
                System.out.println("Ingrese el nombre del empleado: ");
                final var nombre = sc.nextLine();
                System.out.println("Ingrese el salario del empleado: ");
                final var salario = Double.parseDouble(sc.nextLine());
                System.out.println("Ingrese la hora de ingreso del empleado: ");
                final var ingreso = Integer.parseInt(sc.nextLine());
                System.out.println("Ingrese la hora de regreso del empleado: ");
                final var regreso = Integer.parseInt(sc.nextLine());
                final var empleado = new Empleado(nombre, Posicion.values()[i], salario, new Horario(ingreso, regreso));
                empleado.calcularInfraccion();
                empleados.add(empleado);
            }

            for (Empleado empleado : empleados) {
                System.out.println(empleado);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
