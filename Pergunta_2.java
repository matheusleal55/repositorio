import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Questao_2 {

    public static void main(String[] args) {


      /**
       * Para receber a quantidade de Escadas de asteriscos pelo usuario
       * a variavel @Quantidade e criada na classe Scanner e a variavel
       * qtdEscadas recebe seu valor
      
      */

      Scanner Quantidade = new Scanner(System.in);
      System.out.print("Digite a quantidade de vezes: ");
      int qtdLinhas = Quantidade.nextInt();
      Quantidade.close();

      /**
       * Com a quantidade de linhas desejadas um ArrayList e criado
       * do tipo String @Asteriscos que entra em um loop for que percorrera
       * as instrucoes ate que i nao seja menor que a quantidade de linhas.
       * 
       * No ArrayList sera adicinado em seu primeiro indice espacos vazios 
       * igual a quantidade desejada - i atraves do metodo @repeat e mais 
       * i + 1 de asteriscos pela mesma funcao assim fechando o primeiro indice 
       * do ArrayList i recebe +1 o que faz ter menos espacos e mais asteriscos
       * e assim continua ate i ser igual a @qtdLinhas.
      
      */

      List<String> Asteriscos = new ArrayList<>();

      for (int i = 0; i < qtdLinhas; i++) {
        Asteriscos.add(" ".repeat(qtdLinhas - i) + "*".repeat(i + 1));
      }



      /**
       * O proximo Loop for mostra o ArrayList no terminal
       * o primeiro indice e mostrado e o indice seguinte e 
       * mostrado na linha de baixo atraves de println.
      
      */

      for (String d : Asteriscos ) {
      System.out.println(d);
      }

          

        
        
   
     
     
    }
    
}