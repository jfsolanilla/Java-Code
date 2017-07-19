import java.util.ArrayList;
import java.util.Collections;

public class binary {
    public static void main(String[ ] args) {
        solution(1290);
    }    
    
    public static void solution(int N) {
        // write your code in Java SE 8
        
        long numeroFragmentado = 0;
        long contadorCeros = 0;
        long numeros = 0;
        numeroFragmentado = (int) N;
        ArrayList<Integer> numeroCeros = new ArrayList<Integer>();
        ArrayList<Integer> numeroBinario = new ArrayList<Integer>();
        
        // Convierte el entero en binario
        while (numeroFragmentado >= 1){
            numeroBinario.add(0,(int) (numeroFragmentado%2));
            numeroFragmentado = numeroFragmentado/2;
            }
        
        // Recorre el arreglo  y verifica el binary gap
        while (numeros < numeroBinario.size()){
            if (numeros > 0 && numeroBinario.get((int) numeros) == 0 && numeroBinario.get((int) (numeros - 1)) == 1){
                // Busca el siguiente uno
                //while (numeros < numeroBinario.size()) {
                while (numeroBinario.get((int) numeros) == 0) {
                    
                    contadorCeros = contadorCeros + 1;
                    numeros = numeros + 1;
                    if (numeros >= numeroBinario.size()){break;}
                }
                
                if (numeros < numeroBinario.size()) {
                    if (numeroBinario.get((int) (numeros)) == 1) {
                
                    // Inserta el número de ceros del análisis
                    numeroCeros.add((int) contadorCeros);
                    contadorCeros = 0;  // Reinicia el contador
                    }
                }else if (numeros >= numeroBinario.size()){break;}
            }
            numeros = numeros + 1;
        }
        
        Collections.sort(numeroCeros,Collections.reverseOrder() );
        
        if (numeroCeros.size() > 0){
        // Printing the arraylist
        System.out.println("Max binary gap: " + numeroCeros.get(0));
        }else{System.out.println("Max binary gap: " + 0);}
    }
}