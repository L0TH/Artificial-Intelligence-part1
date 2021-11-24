public class Main
{
    public static void main(String[] args)
    {

        // GeneticAlgorithm algorithm = new GeneticAlgorithm();
        Chromosome solution = new Chromosome(10);
            //populationSize, mutationProbability, maximumSteps, minimumFitness
        //algorithm.run(1000, 0.08, 1000, 28); // to 28 tha allaksei analoga me to (n-1) + (n-2) + (n-3) ... + (n-n)
                                                                    // alios na ginete aftomata
        solution.print();

        // kodikas apo front
        /*
        GeneticAlgorithm algorithm = new GeneticAlgorithm();
        //populationSize, mutationProbability, maximumSteps, minimumFitness
        Chromosome solution = algorithm.run(1000, 0.08, 1000, 28);
        solution.print();
        */
    }
}
