package Ra4;
import java.util.Random;
//Wkyouma
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
        int trocas = 0;
        for (int i = 1; i < tamanho; i++) {
            int temp = arr[i];
            int a = i;
            while (a > 0 && arr[a-1] > temp) {
                arr[a] = arr[a-1];
                a-=1;
                trocas++;
            }
            arr[a] = temp;
        }
       
       exibir(arr, tamanho);
       System.out.println("Trocas: " + trocas);
    }

    public void GnomeSort(int tamanho){
        int[] Gnome = Array(tamanho);
        int i = 0;
        int trocas = 0;
        while(i<tamanho - 1){
            if(Gnome[i]>Gnome[i+1]){
                int temp = Gnome[i]; 
                Gnome[i] = Gnome[i+1];   
                Gnome[i+1] = temp;
                trocas++;
                if(i>0)
                {
                    i--;
                }
            }else{
                i++;
            }
        }
        System.out.println("Trocas: " + trocas);
        exibir(Gnome, tamanho);

    }
    public void exibir(int[] arr,int tamanho){
        for (int i = 0; i < tamanho; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    
    }
    
    public static void main(String[] args) {
   
        Ordenacao main = new Ordenacao(); 

        
        main.GnomeSort(10);
        main.InsertionSort(111);
    }
}
