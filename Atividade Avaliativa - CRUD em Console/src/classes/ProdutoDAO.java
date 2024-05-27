package classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    final String FILE_NAME = "produtos.txt";
    List<Produto> produtos;

    public ProdutoDAO() {
        produtos = new ArrayList<>();
        LoadData();
    }

    public void AddProduct(Produto produto) {
        produtos.add(produto);
        SaveData();
    }

    public List<Produto> listProducts() {
        return produtos;
    }

    public Produto searchProductById(int id) {
        return produtos.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void updateProduct(Produto produto) {
        Produto p = searchProductById(produto.getId());
        if (p != null) {
            p.setName(produto.getName());
            p.setPrice(produto.getPrice());
            p.setDescription(produto.getDescription());
            p.setQuantity(produto.getQuantity());
            SaveData();
        }
    }

    public void deleteProduct(int id) {
        produtos.removeIf(p -> p.getId() == id);
        SaveData();
    }

    private void SaveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(produtos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void LoadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            produtos = (List<Produto>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Produtos.txt not found. Assuming no existing data.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}