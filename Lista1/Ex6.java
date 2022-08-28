public class Ex6 {
    public static void main(String[] args) {
        int numero_atual = 0;
        int[] antecessores = {0, 1};

        System.out.println("Sequência de Fibonacci: ");
        System.out.println("-> 0\n-> 1");

        while(true)
        {
            numero_atual = antecessores[0] + antecessores[1];
            antecessores[0] = antecessores[1];
            antecessores[1] = numero_atual;

            System.out.println("-> " + numero_atual);

            if(numero_atual > 100)
            {
                break;
            }
        }

        System.out.println("Fim da sequência de Fibonacci.");
    }
}
