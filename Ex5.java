import java.util.Scanner;

public class Ex5 {

    static long calculaFatorial(int numero)
    {
        long resposta = numero;

        if(numero == 0)
        {
            return 1;
        }

        else if(numero < 0)
        {
            System.out.println("Impossível fazer fatorial de número negativos");
            return -1;
        }

        for(long valor = (numero - 1); valor > 0; valor--)
        {
            resposta *= valor;
        }

        return resposta;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num_inserido;
        long fatorial;

        System.out.print("Digite um número para calcular seu fatorial: ");
        num_inserido = teclado.nextInt();

        fatorial = calculaFatorial(num_inserido);

        if(fatorial != -1)
        {
            System.out.println("Fatorial de " + num_inserido + ": " + fatorial);
        }
        
        teclado.close();
    }
}
