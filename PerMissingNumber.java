public class PerMissingNumber {
    public static void main(String[ ] args) {
        int A[] = {18,19,20};
        System.out.println("Valor faltante: " + (solution(A))); 
    }
    
    public static int solution(int[] A) {
        // write your code in Java SE 8
        
        // Variables
        int i_menor = -1,i_totalIncompleto = 0,i_sumaConsecutivos = 0,i_sumaConsecutivosCero = 0,i_indiceArreglo = 0;
        
        // Verifica el tamaño del arreglo
        if (A.length == 0) {return 1;}
        
        // Loop over the array
        while (i_indiceArreglo < A.length){
            
            // Captura el número menor del arreglo
            if (A[i_indiceArreglo] < i_menor || i_menor == -1) {i_menor = A[i_indiceArreglo];}
            
            // Acumula el total incompleto
            i_totalIncompleto += A[i_indiceArreglo];
            
            // Suma consecutivos según el tamaño del arreglo
            i_sumaConsecutivosCero += i_indiceArreglo;
            i_indiceArreglo++;
            i_sumaConsecutivos += i_indiceArreglo;
        }
        
        // Evaluando los casos. El primer caso es cuando todos los elementos de la serie existen, excepto el primero.
        // El segundo caso es cuando un elemento intermedio no existe en la serie y se va a verificar cuál es
        if ((i_menor*(A.length) + i_sumaConsecutivosCero) == i_totalIncompleto && i_menor > 1) {return i_menor - 1;}
        else return (i_menor*(A.length + 1) + i_sumaConsecutivos) - i_totalIncompleto;
    }    
}
