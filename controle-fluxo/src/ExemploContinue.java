public class ExemploContinue {
    public static void main(String[] args) {
        for( int numero = 0; numero <= 100; numero ++){
            if(numero % 2 == 1)
            continue;
            System.out.println(numero);
        }
    }
}
