public class Lista03Exe03 {

    public static void main(String[] args) {
        metodoRecursivo(0);
    }

    public static void metodoRecursivo(int i) {
        System.out.println("Chamada recursiva: " + i);
        metodoRecursivo(i + 1);
    }
}

// O que acontece?
// Ao executar o programa, você verá uma sequência de mensagens no console, como
// "Chamada recursiva: 0", "Chamada recursiva: 1", "Chamada recursiva: 2" e
// assim por diante. Isso ocorre porque o método metodoRecursivo chama a si
// mesmo indefinidamente, sem uma condição de parada. Eventualmente, o programa
// atinge um estouro de pilha (StackOverflowError), e o programa é interrompido.

// O que é um estouro de pilha e por que ele ocorre?
// O estouro de pilha ocorre quando a pilha de execução (a região de memória
// onde são armazenadas informações sobre métodos e variáveis locais) fica
// cheia. A cada chamada de método, um novo quadro de ativação é empilhado na
// pilha de execução. No caso de recursão infinita, como no código acima, a
// pilha continua sendo preenchida com novos quadros até que a memória destinada
// à pilha se esgote, resultando em um erro StackOverflowError.

// Como você poderia alterar o programa para evitar um estouro de pilha ao usar
// recursão?
// Para evitar o estouro de pilha, é necessário garantir que a recursão tenha
// uma condição de parada, ou seja, um caso base que interrompa as chamadas
// recursivas.
