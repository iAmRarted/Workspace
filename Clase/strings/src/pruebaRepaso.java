public class pruebaRepaso {
    static String reverseWords(String entrada, int posicion) {
        String entrada1;
        entrada1 = entrada.trim();
        String[] words;
        words = entrada1.split("\\s+");
        System.out.println(words.length);
        while(posicion >= 1) {
            if(posicion == 1) {
                entrada1 = entrada1.substring(0, entrada1.indexOf(' '));
                return entrada1;
            }
            if(entrada1.length() > entrada1.indexOf(' ') + 1)
                entrada1 = entrada1.substring(entrada1.indexOf(' ') + 1);

            posicion--;
        }
        
        return "error";
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("hola que tal estas", 3));
    }
}
