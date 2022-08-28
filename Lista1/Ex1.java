import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int n;
        int numero_inserido;
        int contador = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite quantos números deseja inserir: ");
        n = teclado.nextInt();
        
        for(int i = 0; i < n; i++)
        {
            System.out.print("Digite um número: ");
            numero_inserido = teclado.nextInt();
            
            if(numero_inserido < 0)
            {
                contador++;
            }
        }
        
        System.out.println("Quantidade de números negativos inseridos: " + contador);
        teclado.close();
        
    }          
}