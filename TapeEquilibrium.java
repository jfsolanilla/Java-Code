import java.util.Arrays;

//import java.util.*;

public class TapeEquilibrium {

    public static void main(String[ ] args) {
        int A[] = {5,6,-10,4,1};
        System.out.println("Elemento menor: " + (solution(A))); 
    }
    
    public static int solution(int[] A) {
        // write your code in Java SE 8
        
        // Variables
        int i_backwardIndex = A.length - 1;
        int i_forwardSum = 0,i_backwardSum = 0;
        int i_menor = -1;

        int[] a_forward = new int [A.length - 1];Arrays.fill(a_forward,-1);
        int[] a_backward = new int [A.length - 1];Arrays.fill(a_backward,-1);
        //________________________________________________________________________________________
        
        // Loop over the array received as parameter
        for (int i_fordwardIndex = 0;i_fordwardIndex  < A.length - 1;i_fordwardIndex ++) {
            
            // Forward and backward sum
            i_forwardSum += A[i_fordwardIndex];
            i_backwardSum += A[i_backwardIndex];
            
            // Storing the sumatory of the elements
            a_forward[i_fordwardIndex] = i_forwardSum;
            a_backward[i_backwardIndex - 1] = i_backwardSum;
            
            // Verifying if there is elements in the cell
            if (A.length == 2){return Math.abs(a_forward[0] - a_backward[0]);}
            
            else if (a_forward[i_fordwardIndex] != -1 && a_backward[i_fordwardIndex] != -1){
                if (Math.abs(a_forward[i_fordwardIndex] - a_backward[i_fordwardIndex]) < i_menor || i_menor == -1) {
                    i_menor = Math.abs(a_forward[i_fordwardIndex] - a_backward[i_fordwardIndex]); 
                }
                
                if (Math.abs(a_forward[i_backwardIndex - 1] - a_backward[i_backwardIndex - 1]) < i_menor || i_menor == -1) {
                    i_menor = Math.abs(a_forward[i_backwardIndex - 1] - a_backward[i_backwardIndex - 1]); 
                }                
            }
            
            // Updating the reverse index
            i_backwardIndex --;
        }
        
        return i_menor;
        
    }    
}