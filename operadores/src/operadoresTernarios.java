public class operadoresTernarios {
    public static void main(String[] args){
      //(? e :) Operador ternário - uma forma resumida para definir uma condição e escolher por um dentre dois valores
        //<expressão condiconal> ? <caso condição seja true> : (A expressão condiconal é um valor booleano)
        //<caso condição seja falsa>

        int a, b;
        a = 5;
        b = 6;
        String resultado = a==b ? "Verdadeiro!!" : "Falso!!";
        System.out.println(resultado);
    }
}