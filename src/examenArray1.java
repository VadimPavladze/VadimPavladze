import java.util.Arrays;
public class examenArray1 {
    public static void main(String[] args) {
        int [] Crescatoare={90,80,70,60,50,40,30,20,10};
        System.out.println("Original Array: "+Arrays.toString(Crescatoare));

        System.out.println("Array-ul inversat: ");
        for(int a= Crescatoare.length -1; a>=0; a--){
            System.out.println(Crescatoare[a]);
        }

    }
}
