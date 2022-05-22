package Practice;

import java.util.Scanner;

public class SayininİkiveUcKati {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi= scanner.nextInt();
        System.out.println("Lütfen bir sayı giriniz: ");
        Integer sayi1= scanner.nextInt();
        twice(sayi);
        trio(sayi1);

        System.out.println("Sayinin İki Katı: " + twice(sayi));
        System.out.println("Sayinin Üç Katı: " + trio(sayi1));


    }

    public static int twice(int sayi) {

        return Math.abs (sayi*2);

    }
    public static Integer trio (Integer sayi) {
        return  Math.abs (sayi*3);
    }



}
