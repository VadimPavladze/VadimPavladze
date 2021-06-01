import java.util.Arrays;
public class ExamenArray2 {
    public static void main(String[] args) {
        int [] Aranjare ={3,1,2,9,5,4,6,7,8};
        System.out.println("Original Array: "+Arrays.toString(Aranjare));

        Arrays.sort(Aranjare);
        System.out.println("Array Aranjat: "+Arrays.toString(Aranjare));
    }
}
