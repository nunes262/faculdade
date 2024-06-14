package classes;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArquivoHelper {
    private static final String FILE_PATH = "doacoes.txt";
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    public static void salvarDoacoes(List<Doacao> doacoes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Doacao doacao : doacoes) {
                writer.write(doacao.getTipo() + "," + doacao.getQuantidade().toString() + ","
                        + DATE_FORMAT.format(doacao.getData()));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Doacao> carregarDoacoes() {
        List<Doacao> doacoes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String tipo = parts[0];
                Object quantidade;
                if (tipo.equalsIgnoreCase("dinheiro")) {
                    quantidade = Double.parseDouble(parts[1]);
                } else {
                    quantidade = parts[1];
                }
                Date data = DATE_FORMAT.parse(parts[2]);
                doacoes.add(new Doacao(tipo, quantidade, data));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doacoes;
    }
}
