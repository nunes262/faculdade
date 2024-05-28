package classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    private final String FILE_NAME = "produtos.txt";
    private List<Produto> produtos;

    public ProdutoDAO() {
        produtos = new ArrayList<>();
        loadData();
    }

    public void addProduct(Produto produto) {
        produtos.add(produto);
        saveData();
    }

    public List<Produto> listProducts() {
        return produtos;
    }

    public Produto searchProductByName(String name) {
        return produtos.stream().filter(p -> p.getName().equals(name)).findFirst().orElse(null);
    }

    public void updateProduct(Produto produto) {
        Produto p = searchProductByName(produto.getName());
        if (p != null) {
            p.setName(produto.getName());
            p.setPrice(produto.getPrice());
            p.setDescription(produto.getDescription());
            p.setQuantity(produto.getQuantity());
            saveData();
        }
    }

    public void deleteProduct(String name) {
        produtos.removeIf(p -> p.getName().equals(name));
        saveData();
    }

    private void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(produtos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            produtos = (List<Produto>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("produtos.txt not found. Assuming no existing data.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
