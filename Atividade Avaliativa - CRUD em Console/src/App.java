import java.util.List;
import java.util.Scanner;

import classes.Produto;
import classes.ProdutoDAO;

public class App {
    private static ProdutoDAO produtoDAO = new ProdutoDAO();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Atualizar Produto");
            System.out.println("4. Deletar Produto");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    listProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    System.out.println("\nSaindo...");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }

    private static void addProduct() {
        System.out.print("\nID: ");
        int id = scanner.nextInt();

        System.out.print("Quantidade: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String name = scanner.nextLine();

        System.out.print("Descrição: ");
        String description = scanner.nextLine();

        System.out.print("Preço: ");
        double price = scanner.nextDouble();

        Produto produto = new Produto(id, name, description, price, quantity);
        produtoDAO.AddProduct(produto);
        System.out.println("\nProduto adicionado com sucesso!");
    }

    private static void listProduct() {
        List<Produto> produtos = produtoDAO.listProducts();
        if (produtos.isEmpty()) {
            System.out.println("\nNenhum produto encontrado.");
        } else {
            produtos.forEach(System.out::println);
        }
    }

    private static void updateProduct() {
        System.out.print("\nID do produto a ser atualizado: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Produto produto = produtoDAO.searchProductById(id);

        if (produto != null) {
            System.out.print("Novo nome: ");
            String name = scanner.nextLine();

            System.out.print("Nova descrição: ");
            String description = scanner.nextLine();

            System.out.print("Nova quantidade: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Novo preço: ");
            double price = scanner.nextDouble();

            produto.setName(name);
            produto.setPrice(price);
            produto.setQuantity(quantity);
            produto.setDescription(description);

            produtoDAO.updateProduct(produto);
            System.out.println("\nProduto atualizado com sucesso!");

        } else {
            System.out.println("\nProduto não encontrado.");
        }
    }

    private static void deleteProduct() {
        System.out.print("\nID do produto a ser deletado: ");
        int id = scanner.nextInt();
        Produto produto = produtoDAO.searchProductById(id);

        if (produto != null) {
            produtoDAO.deleteProduct(id);
            System.out.println("\nProduto deletado com sucesso!");
        } else {
            System.out.println("\nProduto não encontrado.");
        }
    }
}
