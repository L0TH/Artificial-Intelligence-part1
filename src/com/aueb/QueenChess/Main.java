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
        int N = 10;
        GeneticAlgorithm algorithm = new GeneticAlgorithm(N);
        //populationSize, mutationProbability, maximumSteps, minimumFitness
        Chromosome solution = algorithm.run(1000 + N, 0.08, 1000 + N, calculateMinFitness(N));
        solution.print();
    }

}
