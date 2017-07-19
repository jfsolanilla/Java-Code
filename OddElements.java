import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class OddElements {

    public static void main(String[ ] args) {
        int A[] = {9,8,7,8,9,6,7};
        solution(A);
    }
    
    public static int solution(int[] A) {
        // write your code in Java SE 8
        
        // Variables
        LinkedHashMap<Integer,Integer> hm_oddElements = new LinkedHashMap<Integer,Integer>();
        Boolean b_found;
        
        for (int i_oddElements : A) {   // Loop over the array received as parameter to find the odd elements
            
            b_found = false;
            
            //for(Integer i_key : hm_oddElements.keySet()){   // Loop over the keys of the HashMap
            // Loop over the keys of the HashMap
            for(Entry <Integer,Integer> entry : hm_oddElements.entrySet()){
                
                // Verifying if the element of the array is similar to the elements stored in the auxiliary HashMap
                if (i_oddElements == entry.getKey() && entry.getValue() < 2) {
                    hm_oddElements.put(entry.getKey(),entry.getValue() + 1);
                    b_found = true;
                    continue;
                }
            }
            // The key does not exist in the HashMap. The key will be added
            if (b_found == false) {hm_oddElements.put(i_oddElements,1);}
        }
        
        //__________________________________________________________
        // Loop over the keys of the HashMap
        for(Entry <Integer,Integer> entry : hm_oddElements.entrySet()){
            
            // Verifying if the element of the array is similar to the elements stored in the auxiliary HashMap
               if (entry.getValue() == 1) {
                   System.out.println("No Encontrado " + entry.getKey());
                   return entry.getKey(); 
               }
           }
        //System.out.println("No Encontrado " + -1);
        return -1;
    }    
}