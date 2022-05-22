package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearcher {

    public static void main(String[] args) {

       List<Integer> newList = new ArrayList<Integer>(Arrays.asList(1,2,3,7,10,12,15,18,21,30));


        int index = Collections.binarySearch (newList, 2);
        System.out.println(index);

        index = Collections.binarySearch(newList, 13);
        System.out.println(index);
    }


}
