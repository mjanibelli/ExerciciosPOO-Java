public class Ex3 {
    public static void main(String[] args) {
        int soma = 0;
        int num_atual;

        for(num_atual = 1; num_atual < 1000; num_atual++)
        {
            System.out.println(soma + " + " + num_atual);
            soma += num_atual;
        }

        System.out.println("Soma dos valores de 1 a 999: " + soma);
    }
}
