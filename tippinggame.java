
package tippspiel;
import java.util.Scanner;
import java.security.SecureRandom;


public class Tippspiel {
    public static void main(String[] args) {
        String [][] matrix = new String [7][10];
      
        for (int i=0; i<7; i++){
            for (int j=0; j<10; j++) {
            matrix[i][j]="0";
            }
    }    
        
        
        for (int k=0; k<7; k++){
            for (int m=0; m<10;m++){
                System.out.print(matrix [k][m]+ " ");
            }
            System.out.println();
        }
        
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte gib deinen Tipp ab.In welcher Zeile liegt dein Tipp?");
        int tippx = eingabe.nextInt();
        System.out.println("In welcher Spalte liegt dein Tipp?");
        int tippy=eingabe.nextInt();
        matrix [tippx-1] [tippy-1]="X";
        System.out.println("Hier liegt dein Tipp:");
        for (int k=0; k<7; k++){
            for (int m=0; m<10;m++){
                System.out.print(matrix [k][m]+ " ");
            }
            System.out.println();
        }
        
        SecureRandom random = new SecureRandom();        
        
        int zufallx =random.nextInt(7);
        int zufally=random.nextInt(10);
        
        
        
        if (tippx==zufallx || tippy==zufally) {
            System.out.println("Du hast gewonnen!"); 
            for (int k=0; k<7; k++){
            for (int m=0; m<10;m++){
                System.out.print(matrix [k][m]+ " ");
            }
            System.out.println();
            }
        }
        else {
            matrix[zufallx] [zufally] = "X";
            System.out.println("Du hast verloren. Hier liegt der eigentliche Punkt");
            for (int k=0; k<7; k++){
            for (int m=0; m<10;m++){
                System.out.print(matrix [k][m]+ " ");
            }
            System.out.println();
        }
        }    
        
    }
}
