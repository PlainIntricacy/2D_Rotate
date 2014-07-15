package pkg2d_rotate;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author todyerutz @ plainintricacy.wordpress.com
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("C:/Users/Irukandji/Documents/NetBeansProjects/2D_Rotate/src/pkg2d_rotate/challenge_array.txt"));
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[10][10];
        int angle=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(input.hasNext()){
                    arr[i][j]=input.nextInt();
                }
            }
        }
        System.out.println("Angle: " + angle + " degrees");
        showArr(arr);
        System.out.println("Would you like to rotate the array? y/n");
            while(in.nextLine().toLowerCase().contains("y")){
                angle+=90;
                rotate(arr);
                System.out.println("Angle: " + angle + " degrees");
                showArr(arr);
                System.out.println("Would you like to rotate the array? y/n");
            };
        input.close();
        in.close();
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
