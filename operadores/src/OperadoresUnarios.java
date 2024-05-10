public class OperadoresUnarios {

    public static void main(String[] args) {
        /*(+) Operador unário de valor positivo - numeros são positivos sem esse operador explicitamente
        (-) Operador unário de valor negativo - nega um número ou expressão aritmética
        (++) Operador unário de incremento de valor - incrementa o valor em uma unidade
        (--) Operador unário de decremento de valor - decrementa o valor em uma unidade 
        (!) Operador unário lógico de negação - nega o valor de uma expressão booleana*/

        int numero = 5;

        numero = - numero; // Tornar o valor negativo -
        System.out.println(numero);

        numero = numero * -1;// Tornar o valor positivo *
        System.out.println(numero);

        numero++; // Mesma coisa que, numero = numero + 1
        System.out.println(numero);

        System.out.println(-- numero);/*pode-se fazer a incrementação/decrementação no print, porem tem q colocar o ++ ou -- antes da variável;
        caso coloque dps da variavel, o print irá ser o numero original e dps incrementara/decrementara o valor. ex.: (numero ++)*/

        System.out.println(" ");

        boolean variavel = false;
        System.out.println(!variavel);//Nega a variavel no print, mas até aqui o valor da variavel ainda é falso

        variavel = !variavel; //Agr o valor da variavel booleana foi invertido
        System.out.println(variavel);

     }
}
