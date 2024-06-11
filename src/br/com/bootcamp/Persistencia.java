package br.com.bootcamp;

import java.io.*;
import java.util.*;

public class Persistencia {

    public static void salvarDados(Set<Dev> devs, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Dev dev : devs) {
                writer.write(dev.getNome() + ";"
                        + dev.getCursosConcluidos().size() + ";"
                        + dev.getMentoriasConcluidas().size() + ";"
                        + dev.calcularProgresso());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Set<Dev> carregarDados(String fileName) {
        Set<Dev> devs = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                Dev dev = new Dev(data[0]);
                devs.add(dev);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return devs;
    }
}

