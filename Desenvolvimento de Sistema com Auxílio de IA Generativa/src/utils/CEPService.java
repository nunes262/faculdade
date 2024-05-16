package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CEPService {
    String Cep;

    public static boolean isValidCEP(String cep) {
        return cep != null && cep.matches("\\d{8}");
    }

    public String getEnderecoFromCEP(String cep) {
        if (!isValidCEP(cep)) {
            return ("CEP Invalido, tente novamente");
        }

        try {
            URL url = new URL("https://viacep.com.br/ws/" + cep + "/json/");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);

            }
            reader.close();
            String result = response.toString().replace(",", "\n").replace("{", "").replace("}", "");
            return result;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
