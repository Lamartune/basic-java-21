package javaNormal;

import java.util.Scanner;

public class ders53_soru8_2 {

	public static void main(String[] args) {
		/*  Kullan�c�dan al�nan say�y� yine kullan�c�n istedi�i tabana d�n��t�ren Class tasarlay�n�z?
		A��klama: Kullan�c�dan al�nan say� 12 olsun d�n��t�r�lecek taban 2'li taban olsun.
		Taban.donustur(12,2) �eklinde girilen say� 1100 �eklinde return edilsin.
		17 say�s� 5 tab�n�na d�n��t�r�lece�inde;
		Taban.donustur(17,5) �eklinde girilen say� 32 �eklinde 5 taban�nda return edilsin. 
		*/
		
		Tabanus t = new Tabanus();
		


		Scanner a = new Scanner(System.in);
		int c,b;
		System.out.println("say� de�eri giriniz");
		c = a.nextInt();

		System.out.println("taban de�erini giriniz");
		b = a.nextInt();
		System.out.println(t.tabanBul(c, b));



	
	}

}
