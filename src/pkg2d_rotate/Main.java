package pkg2d_rotate;
import java.util.Scanner;
/**
 *
 * @author todyerutz @ plainintricacy.wordpress.com
 */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of the 2D array:");
        int n = Integer.parseInt(input.nextLine());
        int[][] arr = new int[n][n];
        int z=1, angle=0;
        if(n>0){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=(z%10);
                z++;
            }
        }
        System.out.println("Angle: " + angle + " degrees");
        showArr(arr);
        System.out.println("Would you like to rotate the array? y/n");
            while(input.nextLine().toLowerCase().contains("y")){
                angle+=90;
                rotate(arr);
                System.out.println("Angle: " + angle + " degrees");
                showArr(arr);
                System.out.println("Would you like to rotate the array? y/n");
            };
        }else{
            System.out.println("Invalid array size.");
        }
        input.close();
    }
        
    public static void showArr(int[][] x){
        for(int i=0; i<x.length; i++){
            for(int j=0; j<x.length; j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void rotate(int[][] x){
        int[][] arr1 = new int[x.length][x.length];
        System.out.println("Rotating array 90 degrees clockwise...");
        for(int i=0; i<x.length; i++){
            for(int j=0; j<x.length; j++){
                arr1[i][j]=x[x.length-j-1][i];
            }
    }
        for(int i=0; i<x.length; i++){
            for(int j=0; j<x.length; j++){
                x[i][j]=arr1[i][j];
        }
    }
    }
}
