
public class FrogJmp {
    public static void main(String[ ] args) {
        
        solution(6,7,6);
    }    

    public static int solution(int X, int Y, int D) {

        // write your code in Java SE 8
        return (int) Math.ceil((double) (Y-X)/D);
    }
    
}
