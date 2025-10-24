import java.util.Arrays;

public class Algoritmos {
     int[] vetor;
     int trocas;
     int lacos;


    public Algoritmos(int[] vetor) {
        this.vetor = vetor;
        this.trocas = 0;
        this.lacos = 0;
    }

    public void comb() {
        int distancia = vetor.length;
        double diminuicaoDistancia = 1.3;
        trocas = 0;
        lacos = 0;
        int trocado;

        trocado = 1;

        while (distancia != 1 || trocado == 1) {
            lacos++;
            distancia = (int) (distancia / diminuicaoDistancia);
            if (distancia < 1) {
                distancia = 1;
            }

            trocado = 0;
            for (int i = 0; i < vetor.length - distancia; i++) {
                lacos++;
                if (vetor[i] > vetor[i + distancia]) {
                    // Swap elements
                    int temp = vetor[i];
                    vetor[i] = vetor[i + distancia];
                    vetor[i + distancia] = temp;
                    trocado = 1;
                    trocas++;
                }
            }
        }
        System.out.println("\nComb Sort");
        System.out.println("Vetor ordenado = " + Arrays.toString(vetor));
        System.out.println("Trocas = " + trocas);
        System.out.println("Lacos = " + lacos + "\n");
    }

    public void gnome() {
        int i = 0;
        trocas = 0;
        lacos = 0;
        while (i < vetor.length) {
            lacos++;
            if (i == 0 || vetor[i-1] <= vetor[i]) {i++;}
            else {
                int temp = vetor[i];
                vetor[i] = vetor[i-1];
                vetor[--i] = temp;
                trocas++;
            }
        }

        System.out.println("Gnome Sort");
        System.out.println("Vetor ordenado = " + Arrays.toString(vetor));
        System.out.println("Trocas = " + trocas);
        System.out.println("Lacos = " + lacos + "\n");
    }

    public void bucket() {
        trocas = 0;
        lacos = 0;
        int n = vetor.length;
        if (n <= 0)
            return;

        int max = vetor[0];
        for (int i = 1; i < n; i++) {
            lacos++;
            if (vetor[i] > max)
                max = vetor[i];
        }

        int numBuckets = 10;
        int[][] buckets = new int[numBuckets][n];
        int[] indices = new int[numBuckets];
        for (int i = 0; i < n; i++) {
            lacos++;
            int bucketIndex = (vetor[i] * numBuckets) / (max + 1);
            buckets[bucketIndex][indices[bucketIndex]++] = vetor[i];
        }
        for (int i = 0; i < numBuckets; i++) {
            lacos++;
            int length = indices[i];
            for (int j = 1; j < length; j++) {
                lacos++;
                int key = buckets[i][j];
                int k = j - 1;
                while (k >= 0 && buckets[i][k] > key) {
                    lacos++;
                    buckets[i][k + 1] = buckets[i][k];
                    k--;
                    trocas++;
                }
                buckets[i][k + 1] = key;
                trocas++;
            }
        }
        int k = 0;
        for (int i = 0; i < numBuckets; i++) {
            lacos++;
            for (int j = 0; j < indices[i]; j++) {
                lacos++;
                vetor[k++] = buckets[i][j];
            }
        }


        System.out.println("======= Bucket Sort =======");
        System.out.println("Vetor ordenado = " + Arrays.toString(vetor));
        System.out.println("Trocas = " + trocas);
        System.out.println("Lacos = " + lacos + "\n");
    }

    public void bubble() {
        trocas = 0;
        lacos = 0;
        int trocado;

        for (int i = 0; i < vetor.length - 1; i++) {
            lacos++;
            trocado = 0;
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                lacos++;
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    trocado = 1;
                    trocas++;
                }
            }
            if (trocado != 1) {
                break;
            }
        }
        System.out.println("Bubble Sort");
        System.out.println("Vetor ordenado = " + Arrays.toString(vetor));
        System.out.println("Trocas = " + trocas);
        System.out.println("Lacos = " + lacos + "\n");
    }

    public void selectionSort() {
        trocas = 0;
        lacos = 0;

        for (int inicio = 0; inicio < vetor.length - 1; inicio++) {
            int menorValor = inicio;
            lacos++;

            for (int i = inicio + 1; i < vetor.length; i++) {
                lacos++;
                if (vetor[i] < vetor[menorValor]) {
                    menorValor = i;
                }
            }

            int temp = vetor[inicio];
            vetor[inicio] = vetor[menorValor];
            vetor[menorValor] = temp;
            trocas++;

        }
        System.out.println("Selection Sort");
        System.out.println("Vetor ordenado = " + Arrays.toString(vetor));
        System.out.println("Trocas = " + trocas);
        System.out.println("Lacos = " + lacos + "\n");
    }

    public void cocktail() {
        int inicio = 0;
        int limite = vetor.length - 1;
        int trocado = 1;
        lacos = 0;
        trocas = 0;

        while (trocado == 1) {
            lacos++;
            trocado = 0;

            for (int i = inicio; i < limite; i++) {
                lacos++;
                if (vetor[i] > vetor[i + 1]) {
                    // Swap elements
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocado = 1;
                    trocas++;
                }
            }

            if (trocado == 0) {
                break;
            }
            limite--;

            for (int i = limite - 1; i >= inicio; i--) {
                lacos++;
                if (vetor[i] > vetor[i + 1]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocado = 1;
                    trocas++;
                }
            }
            inicio++;
        }
        System.out.println("Cocktail Sort");
        System.out.println("Vetor ordenado = " + Arrays.toString(vetor));
        System.out.println("Trocas = " + trocas);
        System.out.println("Lacos = " + lacos + "\n");

    }


}
