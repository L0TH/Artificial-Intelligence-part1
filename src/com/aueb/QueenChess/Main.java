package com.aueb.QueenChess;

public class Main
{
    public static void main(String[] args)
    {
        GeneticAlgorithm algorithm = new GeneticAlgorithm(10);
        //populationSize, mutationProbability, maximumSteps, minimumFitness
        Chromosome solution = algorithm.run(1000, 0.08, 1000, 28);
        solution.print();
    }
}
