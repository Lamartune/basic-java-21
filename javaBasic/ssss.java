package javaNormal;

import java.util.Scanner;

public class ssss {
    static boolean hesap(int s) {
         for(int i=0;i<s;i++){
             if(i%3==0){
                 return true;
             }
             else { return false; }
         }


        return false;
    }
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("d�rt basamakl� bir de�er giriniz : ");
        int deger;

        deger = 0;
        while (true) {
            String c = "";
            deger = scan.nextInt();
            c += deger  ;
            System.out.println(c);
            if (c.length() == 4) {
                break;

            }
            else{
                System.out.println("l�tfen 4 basamakl� bir de�er giriniz :");
                continue;
            }
        }
        System.out.println(hesap(1546));


    }



}
