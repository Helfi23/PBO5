/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo5;

/**
 *
 * @author Helfi Apriliyandi F
 */
  import java.util.Arrays;
public class Petani {
     public static void main(String[] args) {
    String[] KumpulanBuah = {
      "Apel",
      "Pisang",
      "Anggur",
      "Pepaya",
      "Jambu",
      "Duku",
      "Mangga",
      "Durian",
      "Jeruk",
      "Manggis",
    };

    int Masukan = 0;
    int DalamMasukan = 0;
    int UkuranBox = KumpulanBuah.length;

    String[] KumpulanBuahs = Item(KumpulanBuah);
    String[][] BanyakKumpulanBuah = new String[5][2];
    String pointer = KumpulanBuahs[0];

    for (int i = 0; i < KumpulanBuahs.length; i++) {

      if (pointer.charAt(0) != KumpulanBuahs[i].charAt(0)) {
        pointer = KumpulanBuahs[i];
        DalamMasukan++;
        Masukan = 0;
      }

      if (pointer.charAt(0) == KumpulanBuahs[i].charAt(0)) {
        BanyakKumpulanBuah[DalamMasukan][Masukan] = KumpulanBuahs[i];
        Masukan += 1;
      } 
    }

    System.out.println(Arrays.deepToString(BanyakKumpulanBuah));
  }

  public static String[] Item(String[] items) {
    for (int i = 0; i < items.length; i++) {
      String temp = items[i];
      int Posisi = i;

      while( Posisi >= 1 && items[Posisi - 1].charAt(0) > temp.charAt(0) ) {
        items[Posisi] = items[Posisi - 1];
        Posisi--;
      }

      items[Posisi] = temp;
    }

    return items;
  }
}
