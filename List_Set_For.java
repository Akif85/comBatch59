package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class List_Set_For {

    public static void main(String[] args) {

        ArrayList<Integer> newList = new ArrayList<Integer>
                (Arrays.asList(10, 5, 4, 7, 8, 9, 15, 25, 5, 10, 7, 8, 15, 10, 25, 26, 28, 30));
        Set<Integer> newSet = new HashSet<Integer>(newList);
        newSet.stream().sorted().forEach(t-> System.out.print(t + " ")); // Lambdaya göre sıralandı ve print edildi.
        System.out.println();
        System.out.println("set: "+ newSet);
        System.out.println("Setin uzunluğu: "+ newSet.size());

        for (int i = 0; i < newList.size(); i++) {
            if (i%2==0 && i%4==0 && i%3==0) System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i <newSet.size(); i++) {
            if (i%2!=0 || i%3==0) System.out.print(i + " ");
        }

    }
}
