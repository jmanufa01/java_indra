import domain.Finanza;
import util.Util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            final var rutaPelis = "./pelis.csv";
            final var finanzas = Util.obtenerDatosCsv(rutaPelis);
            Util.generarJenkinsFile(finanzas);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
