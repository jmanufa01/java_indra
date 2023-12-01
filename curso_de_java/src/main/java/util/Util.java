package util;

import domain.Finanza;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Util {

    public static List<Finanza> obtenerDatosCsv(String pathArchivo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(pathArchivo));
        String line;
        final var finanzas = new ArrayList<Finanza>();
        while ((line = br.readLine()) != null) {
            String[] campos = line.split(";");

            String tituloPelicula = campos[0];
            int cantidadEspectadores = Integer.parseInt(campos[1])/2;
            int cantidadSalas = Integer.parseInt(campos[2])/2;
            final var finanza = new Finanza(tituloPelicula, cantidadEspectadores, cantidadSalas);
            finanzas.add(finanza);
        }
        return finanzas;
    }

    public static void generarJenkinsFile(List<Finanza> finanzas) throws IOException{
        final var bw = new BufferedWriter(new FileWriter("./Jenkinsfile"));

        bw.write("pipeline {\n");
        bw.write("    agent any\n");
        bw.write("    stages {\n");
        bw.write("        stage('Run') {\n");
        bw.write("            steps {\n");
        for (Finanza finanza : finanzas) {
            bw.write("                printf \"\"\"" + finanza.toString() + "\"\"\"\n");
        }
        bw.write("            }\n");
        bw.write("        }\n");
        bw.write("    }\n");
        bw.write("}\n");
        bw.close();
    }
}
