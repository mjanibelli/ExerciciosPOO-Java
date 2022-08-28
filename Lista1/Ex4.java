public class Ex4 {
    public static void main(String[] args) {
        int valor;

        System.out.println("Valores múltiplos de 3 entre 1 e 100");

        for(valor = 1; valor <= 100; valor++)
        {
            if(valor % 3 == 0)
            {
                System.out.println(valor);
            }
        }
        
    }
    
}
