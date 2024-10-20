package Ra4;
import java.util.Random;

public class Ordenacao {
    private Random random;

    public Ordenacao() {
        this.random = new Random();
    }
    public int[] Array(int tamanho) {
        int[] arr = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            arr[i] = random.nextInt(tamanho); 
        }
        return arr; 
    }
    public void InsertionSort(int tamanho) {
        int[] arr = Array(tamanho);
        for (int i = 1; i < tamanho; i++) {
            int key = arr[i];
            int a = i - 1;
            while (a >= 0 && arr[a] > key) {
                arr[a + 1] = arr[a];
                a--;
            }
            arr[a + 1] = key;
        }
       exibir(arr, tamanho);
    }

    public void GnomeSort(int tamanho){
        int[] arr = Array(tamanho);
       //implementar

    }
    public void exibir(int[] arr,int tamanho){
        for (int i = 0; i < tamanho; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    
    }
    
    public static void main(String[] args) {
   
        Ordenacao main = new Ordenacao(); 

        
        main.InsertionSort(100); 
    }
}
