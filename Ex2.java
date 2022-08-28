import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float valor_r;
        float valor_s;
        float valor_t;

        System.out.print("Digite o valor de R: ");
        valor_r = teclado.nextFloat();

        System.out.print("Digite o valor de S: ");
        valor_s = teclado.nextFloat();

        System.out.print("Digite o valor de T: ");
        valor_t = teclado.nextFloat();

        if(valor_r > valor_s && valor_r > valor_t)
        {
            System.out.println("R é o maior valor!");
        }

        else if(valor_s > valor_r && valor_s > valor_t)
        {
            System.out.println("S é o maior valor!");
        }

        else if(valor_t > valor_r && valor_t > valor_s)
        {
            System.out.println("T é o maior valor!");
        }
        
        teclado.close();
    }

    
}
