import java.util.Scanner;

public class Questao_1 {
	public static void main(String[] args) {

        /**
       * Para receber a senha pelo usuario a variavel @Ler e 
       * criada na classe Scanner e a variavel @Senha recebe seu valor
       * e os contadores dos requisitos sao criados
    */

        Scanner Ler = new Scanner(System.in);

        System.out.println("Escreva algo: ");
		String Senha = Ler.next();
        Ler.close();

        int maiusculas = 0, minusculas = 0, numeros = 0, especial = 0;

        /**
       * A primeira condicao if entra se a senha informada tiver menos que
       * 6 caracteres mostrando no terminal a quantidade que falta.
       * 
       * No poximo loop for cada caracter de @Senha e passado para a variavel char 
       * @Caracter cada vez que o loop e feito e entao as validacoes sao feitas.
       * 
       * Se o caracter for uma letra maiscula a funcao isUpperCase vai confirmar
       * e a variavel @maiusculas vai ganhar +1.
       * 
       * O mesmo vale para as outras validacoes.
       * 
      */

        if(Senha.length()<6){

            System.out.println("Sua senha ainda falta " + (6 - Senha.length()) + " caracteres" );
        }

        for (int i = 0; i < Senha.length(); i++) { // para todos os caracteres da string

            char Caracter = Senha.charAt(i); // pegar o caracter

            if (Character.isUpperCase(Caracter)) {

                maiusculas++;

            } else if (Character.isLowerCase(Caracter)) {

                minusculas++;

            } else if (Character.isDigit(Caracter)) {

                numeros++;

            } else if ((Caracter == ('!') || Caracter == '@' || Caracter == '#'|| Caracter == '$'|| Caracter == '%'|| 
            Caracter == '^'|| Caracter == '&'|| Caracter == '*'|| Caracter == '('|| Caracter == ')'||
            Caracter == '-'|| Caracter == '+' )) {

                especial++;
            }
        }

        /**
       * Se as variaveis de validacao estiverem com o valor igual 0
       * significa que faltou o tipo de caracter da varriavel
       * e sera mostrado no terminal o caracter que falta.
      */

        if(maiusculas == 0){
            System.out.println("coloque uma letra maiuscula");
        }

        if(minusculas == 0){
            System.out.println("coloque uma letra minuscula");
        }

        if(numeros == 0){
            System.out.println("coloque uma numero");
        }

        if(especial == 0){
            System.out.println("coloque um caracter especial");
        }

    }
}