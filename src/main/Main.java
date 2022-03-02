
package main;

import algoritmos.BubbleSort;
import algoritmos.HeapSort;
import algoritmos.InsertionSort;
import algoritmos.MergeSort;
import algoritmos.QuickSort;
import algoritmos.SelectionSort;
import testes.Teste;

/**
 *
 * @author Jelson Matheus da S. Araujo, Ada Beatriz O. Araújo
 */
public class Main {

    
    public static void main(String[] args) {
        testaSelectionSort();
        testaBubbleSort();
        testaInsertionSort();
        testaMergeSort();
        testaHeapSort();
        testaQuickSort();
    }
    
    private static void testaSelectionSort() {
        System.out.println("========= Algoritmo Selection Sort ========\n");
        
        SelectionSort algoritmo = new SelectionSort();
        Teste teste = new Teste(algoritmo);
        
        System.out.println("-> Teste Ordenado:");
        teste.testeArrOrdenado();
        
        System.out.println("-> Teste Inversamente Ordenado:");
        teste.testeArrInverso();
        
        System.out.println("-> Teste Aleatório:");
        teste.testeArrAleatorio();
    }
    
    private static void testaBubbleSort() {
        System.out.println("========= Algoritmo Bubble Sort ========\n");
        
        BubbleSort algoritmo = new BubbleSort();
        Teste teste = new Teste(algoritmo);
        
        System.out.println("-> Teste Ordenado:");
        teste.testeArrOrdenado();
        
        System.out.println("-> Teste Inversamente Ordenado:");
        teste.testeArrInverso();
        
        System.out.println("-> Teste Aleatório:");
        teste.testeArrAleatorio();
    }
    
    private static void testaInsertionSort() {
        System.out.println("========= Algoritmo Insertion Sort ========\n");
        
        InsertionSort algoritmo = new InsertionSort();
        Teste teste = new Teste(algoritmo);
        
        System.out.println("-> Teste Ordenado:");
        teste.testeArrOrdenado();
        
        System.out.println("-> Teste Inversamente Ordenado:");
        teste.testeArrInverso();
        
        System.out.println("-> Teste Aleatório:");
        teste.testeArrAleatorio();
    }
    
    private static void testaMergeSort() {
        System.out.println("========= Algoritmo Merge Sort ========\n");
        
        MergeSort algoritmo = new MergeSort();
        Teste teste = new Teste(algoritmo);
        
        System.out.println("-> Teste Ordenado:");
        teste.testeArrOrdenado();
        
        System.out.println("-> Teste Inversamente Ordenado:");
        teste.testeArrInverso();
        
        System.out.println("-> Teste Aleatório:");
        teste.testeArrAleatorio();
    }
    
    private static void testaQuickSort() {
        System.out.println("========= Algoritmo Quick Sort ========\n");
        
        QuickSort algoritmo = new QuickSort();
        Teste teste = new Teste(algoritmo);
        
        System.out.println("-> Teste Ordenado:");
        teste.testeArrOrdenado();
        
        System.out.println("-> Teste Inversamente Ordenado:");
        teste.testeArrInverso();
        
        System.out.println("-> Teste Aleatório:");
        teste.testeArrAleatorio();
    }
    
    private static void testaHeapSort() {
        System.out.println("========= Algoritmo Heap Sort ========\n");
        
        HeapSort algoritmo = new HeapSort();
        Teste teste = new Teste(algoritmo);
        
        System.out.println("-> Teste Ordenado:");
        teste.testeArrOrdenado();
        
        System.out.println("-> Teste Inversamente Ordenado:");
        teste.testeArrInverso();
        
        System.out.println("-> Teste Aleatório:");
        teste.testeArrAleatorio();
    }
}
