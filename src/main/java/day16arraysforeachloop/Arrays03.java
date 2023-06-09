package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //ornek: integer bir array olusturunuz, icinde 6 tane eleman yerlestiriniz
        // bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz
        int ages[]= new int[6];
        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;

        System.out.println(Arrays.toString(ages));

        //1.yol
        //sort() methodu array deki elemanlari kucukten buyuge dizer

        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0]+ ages[ages.length-1]);

        //2.yol
         int minumum = ages[0];
         int maximun= ages[0];
        for (int w:ages) {
            minumum=Math.min(minumum,w);
            maximun=Math.max(maximun,w);


        }
        System.out.println(minumum+maximun);

        //ornek: string bir array olusturunuz 6 eleman ekleyiniz, yellow dan
        //onceki elemanlari yazdiriniz

        String color[]= new String[6];
        color[0]="Red";
        color[1]="Orange";
        color[2]="Blue";
        color[3]="Yellow";
        color[4]="Green";
        color[5]="Brown";
        System.out.println(Arrays.toString(color));

        for (String w:color) {
            if(w.equals("Yellow")){
                break;
            }
            System.out.println(w);
        }


    }
}
