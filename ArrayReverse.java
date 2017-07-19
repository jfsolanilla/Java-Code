import java.util.Arrays;


public class ArrayReverse {
    public static void main(String[ ] args) {
        //int A[] = {9,8,7,-150,100,345,1000,12};
        int A[] = {};
        solution(A,1);
    }
    
    public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        
        // Variables
        int i_ultimoElemento;
        
        // Recorre el arreglo por el número de pasos requeridos por k
        while (K > 0 && A.length > 0) {
            
            // Almacena el valor del último elemento del arreglo en una variable auxiliar
            i_ultimoElemento = A[A.length - 1];
            
            // Recorre el arreglo para intercambiar índices
            for (int i = A.length - 2; i >= 0; i--) {
                // Intercambia elementos del arreglo
                A[i + 1] = A[i];
            }
            
            // Almacena el último elemento del arreglo en la primera posición
            A[0] = i_ultimoElemento;
            
            K--;
        }
        System.out.println("Arreglo reordenado" + Arrays.toString(A));
        return A;
    }   
}
