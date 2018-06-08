/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Tugas");
        
        int[] array = new int[100];
        System.out.println("Masukkan Nilai...");
        
        for(int i=1; i<array.length; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nilai "+i+" : ");
            array[i] = scanner.nextInt();
            if(array[i]==-1){
                i=100;
                System.out.println("Berhenti..."); 
            }
        }
        int max = array[0];
        for(int i=1; i<array.length; i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        int min = array[0];
        for(int i=1; i<array.length; i++){
            if(min>array[i]){
                min=array[i];  
            }
        }
        System.out.println("Nilai max = "+max);
        System.out.println("Nilai min = "+min);
    }
}
