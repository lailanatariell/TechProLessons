package day17arrays;

import java.util.Arrays;

public class Arrays01 {


    public static void main(String[] args) {
        // arrayleri kisa yoldan nasil olusturabiliriz
        int arr[]={63,7,313,8,4};
        System.out.println(Arrays.toString(arr));

        //ornek: veriler arrayde kac tane cift sayi kac tane tek sayi oldugunu bulan kodu yaziniz
        int sayac=0;
        for (int w:arr) {
            if(w%2==0){
                sayac++;
            }
        }
        //System.out.println(arr.length-sayac);
        System.out.println("arrayde "+sayac+ " adet cift sayi "+(arr.length-sayac)+ " adet tek sayi kullanilmistir");

        //ornek : size verilen string arraydeki isimlerden 5 karakterden az karakter icerenleri consoola yazdiriniz
        String stdName[]= new String[5];

        stdName[0]="Ajda";
        stdName[1]="Ayhan";
        stdName[2]="Tom";
        stdName[3]="Cuneyt";
        stdName[4]="Filiz";

        for (String w:stdName)
              {
            if (w.length()<5){
                System.out.println(w);
            }
        }



    }
}
