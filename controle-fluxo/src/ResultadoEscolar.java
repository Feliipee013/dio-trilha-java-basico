public class ResultadoEscolar {
    public static void main(String[] args) {
       /*int nota = 10;

        //if(nota >= 7)
            System.out.println("Aprovado");
        
        else if(nota >= 5 && nota < 7)
        System.out.println("Recuperação");

        else
       System.out.println("Reprovado");/* */
       int nota = 4;

       String resultado = nota >= 7 ? "APROVADO" : nota >= 5 && nota < 7 ? "RECUPERAÇÃO" : "REPROVADO";

       System.out.println(resultado);
    } 
}
