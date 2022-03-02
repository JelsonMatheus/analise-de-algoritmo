
package testes;

import algoritmos.Algoritmo;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author pege
 */
public class Teste {
    
    private final Algoritmo algoritmo;
    private final int[] arrMill;
    private final int[] arrCemMIll;
    private final int[] arrMilhao;
    
    public Teste(Algoritmo algoritmo) {
        this.algoritmo = algoritmo;
        this.arrMill = geraArray(1000);
        this.arrCemMIll = geraArray(100000);
        this.arrMilhao = geraArray(1000000);
    }
    
    public void testeArrOrdenado() {
        int[] arr = Arrays.copyOf(arrMill, arrMill.length);
        teste(arr, "Vetor com 1000 elemenstos");
        
        arr = Arrays.copyOf(arrCemMIll, arrCemMIll.length);
        teste(arr, "Vetor com 100.000 elemenstos");
        
        arr = Arrays.copyOf(arrMilhao, arrMilhao.length);
        //teste(arr, "Vetor com 1.000.000 elemenstos");
    }
    
    public void testeArrInverso() {
        int[] arr = inverte(arrMill);
        teste(arr, "Vetor com 1000 elemenstos");
        
        arr = inverte(arrCemMIll);
        teste(arr, "Vetor com 100.000 elemenstos");
        
        arr = inverte(arrMilhao);
        //teste(arr, "Vetor com 1.000.000 elemenstos");
    }
    
    public void testeArrAleatorio() {
        int[] arr = Arrays.copyOf(arrMill, arrMill.length);
        embalharar(arr);
        teste(arr, "Vetor com 1000 elemenstos");
        
        arr = Arrays.copyOf(arrCemMIll, arrCemMIll.length);
        embalharar(arr);
        teste(arr, "Vetor com 100.000 elemenstos");
        
        arr = Arrays.copyOf(arrMilhao, arrMilhao.length);
        embalharar(arr);
        //teste(arr, "Vetor com 1.000.000 elemenstos");
    }
    
    private void teste(int[] arr, String nomeTeste) {
        long tempoInicial = System.currentTimeMillis();
        algoritmo.execute(arr);
        long tempoFinal = System.currentTimeMillis() - tempoInicial;
        
        System.out.println("Teste: " + nomeTeste);
        System.out.println("Tempo: " + tempoFinal + "ms");
        System.out.println("");
    }
    
    private int[] geraArray(int n) {
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++ ) {
            arr[i] = i;
        }
        
        return arr;
    }
    
    private void embalharar(int[] vetor) {
        int n = vetor.length;
        Random gerador = new Random();

        for(int i = (n-1); i>0; i--){

            int j = gerador.nextInt(i+1);

            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }
    
    private int[] inverte(int[] arr) {
        int[] newArr = new int[arr.length];
        int j = 0;
        
        for(int i= arr.length-1; i >= 0; i--) {
            newArr[j] = arr[i];
            j++;
        }
        
        return newArr;
    }
    
}
