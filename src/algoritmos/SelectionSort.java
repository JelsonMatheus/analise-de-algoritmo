
package algoritmos;

/**
 *
 * @author pege
 */
public class SelectionSort implements Algoritmo{

    @Override
    public void execute(int[] arr) {
        sort(arr);
    }
    
    private void sort(int[] vetor){
        int n = vetor.length; 
        int min = 0;

        for(int i = 0; i < (n-1); i++){

            min = i;

            for(int j = (i+1); j < n; j++){
                if(vetor[j] < vetor[min]){
                    min = j;
                }
            }

            if(vetor[i] != vetor[min]) {
                int aux = vetor[i];
                vetor[i] = vetor[min];
                vetor[min] = aux;
            }
        }
    }
}
