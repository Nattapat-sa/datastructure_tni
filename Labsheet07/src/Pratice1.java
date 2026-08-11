import java.util.ArrayList;
public class Pratice1 {
    public static void main(String[] args) {
        ArrayList<Integer> original = new ArrayList<Integer>(10);

        for (int i = 11; i < 21; i++) {
            original.add(i);
        }

        System.out.println("Original Sequence: " + original);

      
        original.clear();
        reverseList(original);

        System.out.println("Reversed Sequence: " + original);
    }

    public static ArrayList<Integer> reverseList(ArrayList<Integer> original) {

        for (int i = 20; i >10; i--) {
            original.addLast(i);
        }

        return original;
    }


}
