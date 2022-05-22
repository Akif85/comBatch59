package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class List_Set {

    public static void main(String[] args) {

        ArrayList<Integer> newList = new ArrayList<Integer> (Arrays.asList(10, 5, 4, 7, 8, 9, 15, 25, 5, 10, 7, 8, 15, 10));
        Set<Integer> newSet = new HashSet<Integer>(newList);
        newSet.stream().sorted().forEach(t-> System.out.print(t + " ")); // Lambdaya göre sıralandı ve print edildi.
        System.out.println();
        System.out.println("set: "+ newSet);
        System.out.println("Setin uzunluğu: "+ newSet.size());

    }
}
