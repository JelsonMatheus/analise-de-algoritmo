
package algoritmos;

/**
 *
 * @author pege
 */
public class InsertionSort implements Algoritmo{

    @Override
    public void execute(int[] arr) {
        sort(arr);
    }
    
    private void sort(int[] vetor){

        int n = vetor.length;

        for(int i = 1; i < n; i++){

            int aux = vetor[i];
            int j = i;

            while(j > 0 && vetor[j-1] > aux){

                vetor[j] = vetor[j-1];
                j--;
            }

            vetor[j] = aux;
        }
    }
    
}
