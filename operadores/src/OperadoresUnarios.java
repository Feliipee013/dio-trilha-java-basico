public class OperadoresUnarios {

    public static void main(String[] args) {
        //(+) Operador unário de valor positivo - numeros são positivos sem esse operador explicitamente
        //(-) Operador unário de valor negativo - nega um número ou expressão aritmética
        //(++) Operador unário de incremento de valor - incrementa o valor em uma unidade
        // (--) Operador unário de decremento de valor - decrementa o valor em uma unidade 
        //(!) Operador unário lógico de negação - nega o valor de uma expressão booleana

        int numero = 5;

        numero = - numero; // Tornar o valor negativo -
        System.out.println(numero);

        numero = numero * -1;// Tornar o valor positivo *
        System.out.println(numero);

        numero++; // Mesma coisa que, numero = numero + 1
        System.out.println(numero);

        System.out.println(-- numero);// pode-se fazer a incrementação/decrementação no print, porem tem q colocar o ++ ou -- antes da variável;
        // caso coloque dps da variavel, o print irá ser o numero original e dps incrementara/decrementara o valor. ex.: (numero ++)

        System.out.println(" ");

        boolean variavel = false;
        System.out.println(!variavel);//Nega a variavel no print, mas até aqui o valor da variavel ainda é falso

        variavel = !variavel; //Agr o valor da variavel booleana foi invertido
        System.out.println(variavel);

        System.out.println(" ");

        //(? e :) Operador ternário - uma forma resumida para definir uma condição e escolher por um dentre dois valores
        //<expressão condiconal> ? <caso condição seja true> : (A expressão condiconal é um valor booleano)
        //<caso condição seja falsa>

        int a, b;
        a = 5;
        b = 6;
        String resultado = a==b ? "Verdadeiro!!" : "Falso!!";
        System.out.println(resultado);
        System.out.println(" ");

        //(==) Quando desejamos verificar se uma variável é igual a outra;
        //(!=) ||        ||         ||            ||     é diferente da outra;
        //(>)  ||        ||         ||            ||     é maior q a outra;
        //(>=) ||        ||         ||            ||     é maior ou igual a outra;
        //(<)  ||        ||         ||            ||     é menor q a outra;
        //(<=) ||        ||         ||            ||     é menor ou igual a outra.

        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;
        System.out.println("NumeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("NumeroUm é diferente a numeroDois? " + simNao);   
        
        simNao = numero1 > numero2;
        System.out.println("NumeroUm é maior que numeroDois? " + simNao);

        if(numero1 < numero2) {// Os operadores relacionais realizam fluxos dependendo se a expressão seja verdadeira
            System.out.println("A nossa condição é verdadeira");
        }
        System.out.println(" ");

        //(&&) Operador lógico "E"
        //(||) Operador lógico "OU"

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && ( 7 > 4 )){
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das duas condições é verdadeira");
        }

     }
}
