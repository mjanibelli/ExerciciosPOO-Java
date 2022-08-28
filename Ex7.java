import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float notas_pessimas = 0;
        float notas_ruins = 0;
        float notas_boas = 0;
        float notas_otimas = 0;
        float total_avaliadores = 0;
        int nota_inserida;

        System.out.println("Digite sua nota (0 a 100): ");
        nota_inserida = teclado.nextInt();

        while(nota_inserida >= 0 && nota_inserida <= 100)
        {
            total_avaliadores++;

            if(nota_inserida <= 25)
            {
                notas_pessimas++;
            }

            else if(nota_inserida <= 50)
            {
                notas_ruins++;
            }

            else if(nota_inserida <= 75)
            {
                notas_boas++;
            }

            else
            {
                notas_otimas++;
            }

            System.out.println("Digite sua nota (0 a 100): ");
            nota_inserida = teclado.nextInt();
        }

        if(total_avaliadores > 0)
        {
            System.out.println("Percentual de notas péssimas: " + (notas_pessimas/total_avaliadores) * 100 + " %");
            System.out.println("Percentual de notas ruins: " + (notas_ruins/total_avaliadores) * 100 + " %");
            System.out.println("Percentual de notas boas: " + (notas_boas/total_avaliadores) * 100 + " %");
            System.out.println("Percentual de notas ótimas: " + (notas_otimas/total_avaliadores) * 100 + " %");
        }

        else
        {
            System.out.println("Sem avaliadores.");
        }
        
        teclado.close();
    }
}
