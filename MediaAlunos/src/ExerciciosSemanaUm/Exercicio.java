package ExerciciosSemanaUm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio {

//    public static void main(String[] args) {

        ArrayList<String> listaAlunos = new ArrayList<>();
        ArrayList<double[]> listaNotas = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);
        /*Agora dentro do laço de repetição while receba nome do aluno e armazene em ArrayList*/
        System.out.println("digite nome do aluno ou fim para finalizar");
        String digitado = entrada.next();
        while (!digitado.equalsIgnoreCase("fim")) {
            listaAlunos.add(digitado);
            System.out.println("Digite as notas do Aluno");
            System.out.print("Digite a nota 1 =");
            double n1 = entrada.nextDouble();
            System.out.print("Digite a nota 2 =");
            double n2 = entrada.nextDouble();
            System.out.print("Digite a nota 3 =");
            double n3 = entrada.nextDouble();
            double[] notas = new double[3];
            /* Ainda dentro do laço de repetição while receba agora 3 notas e armazene
            em Array ( Vetor ) de 3 posições/*
             */
            notas[0] = n1;
            notas[1] = n2;
            notas[2] = n3;
            listaNotas.add(notas);
            System.out.println("digite o nome do aluno ou fim para finalizar");
            digitado = entrada.next();

        }
        //Quando então digitado FIM, deverá exibir então a lista de alunos e suas notas//

        ArrayList<String> aprovados = new ArrayList<>();
        ArrayList<String> reprovados = new ArrayList<>();
        ArrayList<Double> mediaAprovados = new ArrayList<>();
        ArrayList <Double> mediaReprovados = new ArrayList<>();

            for (int i = 0 ; i < listaAlunos.size(); i++){
            System.out.println("Aluno(a)"+ listaAlunos.get(i));
            System.out.println("Notas" + Arrays.toString(listaNotas.get(i)));
            /* Faça uma alteração para calcular a média e exibir junto com a lista de alunos e suas notas*/
            double totalNotas = 0.0;
            for (int n = 0; n < listaNotas.get(i).length; n++) {
                totalNotas += listaNotas.get(i)[n];
            }
        double media = totalNotas / listaNotas.get(i).length;
        System.out.println("Média do aluno(a)" + listaAlunos.get(i)+ "m" + media);    i
        if(media >= 7.0){
            aprovados.add(listaAlunos.get(i) + "commedia" + media)
         }
    }
}