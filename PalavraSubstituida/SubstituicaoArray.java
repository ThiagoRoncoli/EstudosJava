package PalavraSubstituida;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SubstituicaoArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu texto aqui:");
        String texto = scanner.nextLine();
        System.out.print("Digite uma palavra para ser substituida: ");
        String palavraSubs = scanner.nextLine();
        System.out.print("Digite a nova palavra: ");
        String novaPalavra = scanner.nextLine();
        String textoNovo = texto.replace(palavraSubs, novaPalavra);


        if(texto.contains(palavraSubs)){
            System.out.println("Seu texto modificado: " + textoNovo);
            System.out.println("Palavra para ser substituida não encontrada!");
        }else{
            System.out.println("Palavra não encontrada!");
        }




        scanner.close();
    }
}
