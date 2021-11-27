package com.aueb.QueenChess;

public class Main
{
   private static int calculateMinFitness(int N){
        int sum = 0;
        for(int i = 1; i < N; i++){
            sum += N - i;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        for(int i =3; i <= 15; i++) {
            int N = i;
            GeneticAlgorithm algorithm = new GeneticAlgorithm(N);
            Chromosome solution = algorithm.run(1000 + N, 0.08, 1000 + N, calculateMinFitness(N));
            System.out.println("N = " + N);
            solution.print();
        }
    }

}
