package Practice;

import java.util.*;

public class Dublicate {


    //1, 3, 1, 2, 4, 5, 3,0,2,25,25,2,4,35,65,9,19,19,18,65 sayılarının bir listesini oluşturun
    // kaç tane tekrarli eleman olduğunu sayin
    // yinelenen değerlerin ne olduğunu öğrenin
    // Yeni listenin önce List'e göre daha sonra Array'a göre uzunluğunu alın.

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, 1, 2, 4, 5, 3,0,2,25,25,2,4,35,65,9,19,19,18,65));

        int tekrarliElemanSayisi=0;
        Set<Integer> uniqueElemanlar = new HashSet<Integer>();
        List<Integer> tekrarliElemanlar = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            boolean ekliMi=uniqueElemanlar.add(numbers.get(i));
            if(!ekliMi){ // uniqe elemanlara eklenmediyse o eleman duplicate tir
                tekrarliElemanSayisi++; // bu durumda duplicate sayisi 1 artar
                tekrarliElemanlar.add(numbers.get(i)); //duplicate olan bu eleman tekrarliElemanlar listesine eklenir
            }
        }
        System.out.println("tekrarliElemanSayisi = " + tekrarliElemanSayisi); 
        System.out.println("tekrarliElemanlar = " + tekrarliElemanlar);
        System.out.println(tekrarliElemanlar.size());
        System.out.println(tekrarliElemanlar.stream().toArray().length);
    }
}
