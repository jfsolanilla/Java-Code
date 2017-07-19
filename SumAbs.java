import java.util.ArrayList;

public class SumAbs {

    public static void main(String[ ] args) {
        //int A[] = {9,8,7,-150,100,345,1000,12};
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);A.add(-2);A.add(-3);
        System.out.println("Suma" + sum(A));
    }

    private static int sum(ArrayList<Integer> lista) {
        int suma = 0;
        for (int x : lista)
            suma += x;
        return suma;
    }    
}
