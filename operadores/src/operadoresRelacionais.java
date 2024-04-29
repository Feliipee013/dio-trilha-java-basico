public class operadoresRelacionais {
    public static void main(String[] args) {
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
}
}