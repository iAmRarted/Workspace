public class repaso {
    static String reverseWords(String entrada, int posicion) {
        String entrada1;
        entrada1 = entrada.trim();
        while(posicion >= 1) {
            if(posicion == 1) {
                if(entrada1.indexOf(' ') != -1) {
                    entrada1 = entrada1.substring(0, entrada1.indexOf(' '));
                    return entrada1;
                } else {
                    return entrada1;
                }
            }
            entrada1 = entrada1.substring(entrada1.indexOf(' ') + 1);

            posicion--;
        }
        
        return "error";
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("hola que tal estas", 2));
    }
}
