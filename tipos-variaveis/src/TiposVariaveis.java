public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        
         //tipos primitivos

        //byte: Um tipo numérico inteiro com 8 bits de tamanho 
          // Tentando ultrapassar o limite do byte (vai dar erro!)
            // byte numeroGrande = 130; // ERRO: valor fora do intervalo permitido
            byte idade = 25;

        //short: Um tipo numérico inteiro com 16 bits de tamanho 
            short numeroCurto = 1;

        //int: Um tipo numérico inteiro com 32 bits de tamanho 
            int numero = 12; 

        //long: Um tipo numérico inteiro com 64 bits de tamanho e tem que ter o "L"
            long cpf = 12345678900L;

        //boolean: Um tipo que aceita apenas os valores true ou false 
            boolean doadorOrgao = true;

        //char: Um tipo que pode receber caracteres, valores literais do tipo int e unicode 
            char sexo = 'M';

        //float: Um tipo numérico de ponto flutuante com 4 bytes de tamanho e tem que colocar o "F"
            float pi = 3.14f;

        //double: Um tipo numérico de ponto flutuante com 8 bytes de tamanho 
            double peso = 68.5;

        //constante
            final double VALOR_DE_PI = 3.14;

        //representar texto
            String meuNome = "Eric";
    }
}
