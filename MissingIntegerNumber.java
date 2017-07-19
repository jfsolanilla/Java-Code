import java.util.ArrayList;
import java.util.Collections;

public class MissingIntegerNumber {
    public static void main(String[ ] args) {
        int A[] = {1};
        System.out.println("Elemento faltante: " + (solution(A))); 
    }
    
    public static int solution(int[] A) {
        // Variables
        ArrayList<Integer> al_elements = new ArrayList<Integer>();
        int i_counter = 1;
        
        // Adding elements to an ArrayList
        for (int i_elements : A) {
            if (al_elements.contains(i_elements) == false && i_elements > 0){al_elements.add(i_elements);}
        }
        
        // Finding the number one in the ArrayList
        if (al_elements.contains(1) == false){return 1;}
        else if (al_elements.contains(1) == true && al_elements.size() == 1){return 2;}
        
        // Sorting the elements
        Collections.sort(al_elements);
        
        // Loop over the ArrayList to find the missing number
        for (int i_arrayIndex = 0;i_arrayIndex < al_elements.size(); i_arrayIndex ++){
            if (i_counter != al_elements.get(i_arrayIndex)){return i_counter;}
            i_counter ++;
        }
     
        return al_elements.get(al_elements.size() - 1);
    }
}