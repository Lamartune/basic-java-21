package javaNormal;

import java.util.Scanner;

public class cal�sma1 {

    public static void main(String[] args) {
    int a,b,c,toplam;
    float ortalama = 0;
    Scanner tara = new Scanner(System.in);

    System.out.println("1. say�y� giriniz");
    a = tara.nextInt();
    System.out.println("2. say�y� giriniz");
    b = tara.nextInt();
    System.out.println("3. say�y� giriniz");
    c = tara.nextInt();

    if (a>b && b>c) // en b�y�k A en k���k c ise
        ortalama = (float)(a+c)/2;
    else if (a>c && c>b) // en b�y�k a en k���k b ise
        ortalama = (float)(a+b)/2;
    if (b>a && a>c)
        ortalama = (float)(b+c)/2; //en b�y�k b en k���k c ise
    else if (b>c && c>a)
        ortalama = (float)(b+a)/2;  // en b�y�k b en k���k a ise
    if (c>a && a>b) // en b�y�k c en k���k b ise
        ortalama = (float)(c+b)/2;
    else if (c>b && b>a) // en b�y�k c en k���k a ise
        ortalama = (float)(c+a)/2;

    System.out.println("Sonucunu : "+ortalama);

    }
}
