public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        //testando depuração
       // String concatenacao = "?";

         //   concatenacao = 1+1+1+"1";
           //     System.out.println(concatenacao);
        //    concatenacao = 1+"1"+1+1;
          //      System.out.println(concatenacao);
        //    concatenacao = 1+"1"+1+"1";
          //      System.out.println(concatenacao);
        //    concatenacao = "1"+1+1+1;
          //      System.out.println(concatenacao);
        //    concatenacao = "1"+(1+1+1);
          //      System.out.println(concatenacao);


        //TESTE COM UNÁRIOS
            int numero = 5;
        
        //System.out.println(-numero); não afeta a variavel
        numero = - numero;
            System.out.println(numero);
        //numero = + numero ; não fica positivo
        //tornando positivo outra vez
        numero = numero * -1;
            System.out.println(numero);

        //incrementação e decrementação
        int testeNumero = 5;
            //primeira forma
            //System.out.println(++testeNumero);    
        //segunda forma
            testeNumero = ++ testeNumero;   
                System.out.println(testeNumero); //decremento é da mesma forma

        //com booleanos
        //"!" inverter valor de variavel booleana    
        boolean variavel= true;
             //primeira forma
                //System.out.println(!variavel);
             //segunda forma
            variavel = !variavel;
                System.out.println(variavel);     

       //ternário
         int a, b;
         a = 5;
         b = 6;
         String resultado = a == b ? "verdadeiro" : "falso";//pode ser 1 ou 0 no lugar do true e false respectivamente
         System.out.println(resultado); 

        //Relacionais 
            int numero1 = 1;
            int numero2 = 2;
            boolean simNao = numero1 == numero2;
                System.out.println("Numero1 é igual Numero2? " + simNao);


            simNao = numero1 != numero2;
                System.out.println("Numero1 é diferente de Numero2? " + simNao);

            simNao = numero1 > numero2;
                System.out.println("Numero1 é maior que Numero2? " + simNao);  
            simNao = numero1 < numero2;
                System.out.println("Numero1 é menor que Numero2? " + simNao);  
        //Relacionais (comparando conteudos)              
        String nome1 = "jose";
        String nome2 = "jose";
            System.out.println("Nome1 é igual a Nome2? "+nome1.equals(nome2));

        //Lógicos 
        boolean condicao1=true;
        boolean condicao2=false;   
         if (condicao1 && condicao1) {
            System.out.println("Os dois valores precisam ser verdadeiros");
         }  if (condicao1 || condicao1) {
            System.out.print("Um dos valores precisa ser verdadeiro");
         } 
    }
}
