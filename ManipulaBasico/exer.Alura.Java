import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto do arquivo: ");
        String texto = scanner.nextLine();

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if(texto.toLowerCase().contains(palavra.toLowerCase())){
            System.out.println("A palavra \""  + palavra + "\"  contém no texto!");
        }else{
            System.out.println("A palavra não contem!");
        }
        scanner.close();
    }
}