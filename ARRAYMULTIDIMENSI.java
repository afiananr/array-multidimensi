/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraymultidimensi;

/**
 *
 * @author HP
 */
public class ARRAYMULTIDIMENSI {
    public static void main(String[] args) {
        int[][] array2D = {
            {1, 2, 3},  // Baris 0: 1, 2, 3
            {4, 5, 6},  // Baris 1: 4, 5, 6
            {7, 8, 9}   // Baris 2: 7, 8, 9
        };
        // Menampilkan isi array dua dimensi
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println(); // Untuk pindah ke baris berikutnya setelah satu baris selesai ditampilkan
        }
    }
}
