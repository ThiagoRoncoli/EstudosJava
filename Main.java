
import java.util.*;

/*
Você deseja analisar as notas dos alunos e alunas em
uma disciplina para entender melhor o desempenho da turma.
Além da média, você também quer saber a menor e a maior nota
para ter um panorama completo. Para isso, você deve criar um programa que seja capaz de:

Criar uma lista contendo as notas dos alunos.
Utilizar reduce() para calcular a soma total das notas.
Calcular a média das notas.
Determinar a menor e a maior nota da lista. Dica: use a função max e min da classe Stream.
Exibir os resultados no console.
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        double notaMax = Collections.max(notas);

        double notaMin = Collections.min(notas);

        double totalNotas = notas.stream().reduce(0.0, Double::sum);

        double mediaNotas = totalNotas / notas.size();

        System.out.printf("Nota mais baixa: %.1f \n", notaMin);
        System.out.printf("Nota mais alta: %.1f \n", notaMax);
        System.out.printf("Média das notas foi: %.1f", mediaNotas);
    }
}


