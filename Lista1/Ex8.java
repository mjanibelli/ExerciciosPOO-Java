import java.util.Scanner;

public class Ex8 {
    static int verificaMatriz(int[][] matriz, int ordem_matriz)
    {
        
        // Retorna 1 se for quadrado mágico e 0 se não for!

        int soma_linha_ini = 0;
        int soma_coluna_ini = 0;

        int soma_diag_princ = 0;
        int soma_diag_sec = 0;

        // Calculando os somatórios das linhas:
        for(int coluna = 0; coluna < ordem_matriz; coluna++)
        {
            soma_linha_ini += matriz[0][coluna];
        }

        for(int linha = 1; linha < ordem_matriz; linha++)
        {
            int soma_linha = 0;

            for(int coluna = 0; coluna < ordem_matriz; coluna++)
            {
                soma_linha += matriz[linha][coluna];
            }

            if(soma_linha_ini != soma_linha)
            {
                return 0;
            }
        }

        // Calculando os somatórios das colunas: 
        for(int linha = 0; linha < ordem_matriz; linha++)
        {
            soma_coluna_ini += matriz[linha][0];
        }

        for(int coluna = 1; coluna < ordem_matriz; coluna++)
        {
            int soma_coluna = 0;

            for(int linha = 0; linha < ordem_matriz; linha++)
            {
                soma_coluna += matriz[linha][coluna];
            }

            if(soma_coluna_ini != soma_coluna)
            {
                return 0;
            }
        }

        if(soma_linha_ini != soma_coluna_ini)
        {
            return 0;
        }

        // Calculando o somatório da diagonal principal: 
        for(int posicao = 0; posicao < ordem_matriz; posicao++)
        {
            soma_diag_princ += matriz[posicao][posicao];
        }

        if(soma_linha_ini != soma_diag_princ)
        {
            return 0;
        }

        // Calculando o somatório da diagonal secundária: 
        int v1 = (ordem_matriz - 1);

        for(int v2 = 0; v2 < ordem_matriz; v2++)
        {
            soma_diag_sec += matriz[v1][v2];
            v1--;
        }

        if(soma_linha_ini != soma_diag_sec)
        {
            return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ordem_matriz;

        System.out.print("Digite a ordem da matriz a ser inserida: ");
        ordem_matriz = teclado.nextInt();

        int[][] matriz = new int[ordem_matriz][ordem_matriz];

        for(int linha = 0; linha < ordem_matriz; linha++)
        {
            for(int coluna = 0; coluna < ordem_matriz; coluna++)
            {
                System.out.print("Digite o elemento " + linha + " " + coluna + " da matriz: ");
                matriz[linha][coluna] = teclado.nextInt();
            }
        }

        if(verificaMatriz(matriz, ordem_matriz) == 1)
        {
            System.out.println("A matriz é um quadrado mágico!");
        }

        else
        {
            System.out.println("A matriz não é um quadrado mágico!");
        }

        teclado.close();
    }
}
