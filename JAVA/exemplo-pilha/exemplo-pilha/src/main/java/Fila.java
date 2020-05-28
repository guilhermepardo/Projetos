public class Fila {

private int tamanho;
private String[] fila;

    public Fila(int capacidade) {
        tamanho = 0;
        fila = new String[capacidade];
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public boolean isFull() {
        return tamanho == fila.length;
    }

    public void insert(String info) {
        if (!isFull()) {
            fila[tamanho++] = info;
        } else {
            System.out.printf("Fila está cheia!");
        }
    }

    public String peek() {
        if (!isEmpty()) {
            return fila[0];
        } else {
            return "Fila não possui nenhuma string!";
        }
    }

    public String poll() {
        String primeiro = peek();
        if (!isEmpty()) {
           for (int i = 0; i < tamanho - 1; i++) {
               fila[i] = fila[i+1];
           }
           tamanho--;
        }
         return primeiro;
    }

    public void exibe() {
        if (isEmpty()) {
            System.out.printf("Fila está vazia!");
        } else {
            for (int i = 0; i < fila.length; i++) {
                System.out.println(fila[i]);
            }
        }
    }

}
