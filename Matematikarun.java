/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author ASUS
 */
public class Matematikarun {

    public static void main(String[] args) {
        Matematika matematikarun = new Matematika();
        int hasilpertambahan = matematikarun.pertambahan(20, 20);
        int hasilpengurangan = matematikarun.pengurangan(10, 5);
        int hasilperkalian = matematikarun.perkalian(10, 20);
        int hasilpembagian = matematikarun.pembagian(21, 2);

        System.out.println("Pertambaham: 20+20=" + hasilpertambahan);
    }
}
