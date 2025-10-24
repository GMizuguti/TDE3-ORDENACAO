public class Main {
    public static void main(String[] args) {
        int[] vetor1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};

        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};

        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};


        Algoritmos algoritmoComb = new Algoritmos(vetor1);
        algoritmoComb.comb();

        vetor1= new int[]{12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        Algoritmos algoritmoGnome = new Algoritmos(vetor1);
        algoritmoGnome.gnome();

        vetor1= new int[]{12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        Algoritmos algoritmoBucket = new Algoritmos(vetor1);
        algoritmoBucket.bucket();

        vetor1= new int[]{12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        Algoritmos algoritmoBubble = new Algoritmos(vetor1);
        algoritmoBubble.bubble();

        vetor1= new int[]{12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        Algoritmos algoritmoSelectionSort = new Algoritmos(vetor1);
        algoritmoSelectionSort.selectionSort();

        vetor1= new int[]{12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        Algoritmos algoritmoCocktail = new Algoritmos(vetor1);
        algoritmoCocktail.cocktail();


        algoritmoComb = new Algoritmos(vetor2);
        algoritmoComb.comb();

        vetor2 = new int[]{5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        algoritmoGnome = new Algoritmos(vetor2);
        algoritmoGnome.gnome();

        vetor2 = new int[]{5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        algoritmoBucket = new Algoritmos(vetor2);
        algoritmoBucket.bucket();

        vetor2 = new int[]{5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        algoritmoBubble = new Algoritmos(vetor2);
        algoritmoBubble.bubble();

        vetor2 = new int[]{5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        algoritmoSelectionSort = new Algoritmos(vetor2);
        algoritmoSelectionSort.selectionSort();

        vetor2 = new int[]{5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        algoritmoCocktail = new Algoritmos(vetor2);
        algoritmoCocktail.cocktail();


        algoritmoComb = new Algoritmos(vetor3);
        algoritmoComb.comb();

        vetor3 = new int[]{99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        algoritmoGnome = new Algoritmos(vetor3);
        algoritmoGnome.gnome();

        vetor3 = new int[]{99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        algoritmoBucket = new Algoritmos(vetor3);
        algoritmoBucket.bucket();

        vetor3 = new int[]{99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        algoritmoBubble = new Algoritmos(vetor3);
        algoritmoBubble.bubble();

        vetor3 = new int[]{99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        algoritmoSelectionSort = new Algoritmos(vetor3);
        algoritmoSelectionSort.selectionSort();

        vetor3 = new int[]{99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        algoritmoCocktail = new Algoritmos(vetor3);
        algoritmoCocktail.cocktail();
    }
}