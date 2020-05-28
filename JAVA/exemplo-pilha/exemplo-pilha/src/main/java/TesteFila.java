public class TesteFila {

    public static void main(String[] args) {

        Fila fila = new Fila(4);

        fila.insert("Primeiro");
        fila.insert("Segundo");
        fila.insert("Terceiro");
        fila.insert("Quarto");

        System.out.println("");
        System.out.printf(fila.peek());
        System.out.println("");

        fila.exibe();

        fila.poll();

        System.out.println("");
        System.out.println("");

        System.out.println(fila.peek());

        System.out.println("");

        fila.exibe();



    }

}
