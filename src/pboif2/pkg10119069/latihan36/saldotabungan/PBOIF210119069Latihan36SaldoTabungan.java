/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119069.latihan36.saldotabungan;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 * Deskripsi Program    : program ini berisi program saldo tabungan
 */
public class PBOIF210119069Latihan36SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Saldo saldo = new Saldo();
        System.out.print("Saldo Awal\t : Rp. ");
        saldo.saldoAwal = input.nextDouble();
        System.out.print("Bunga/bulan(%)\t : ");
        saldo.bunga = input.nextFloat();
        System.out.print("Saldo Target\t : Rp. ");
        saldo.saldoTarget = input.nextDouble();

        saldo.saldoTabungan();
        System.out.println("-------------------------------------");
        System.out.println("Developed by : Tri Novarel Rahmadhani");  
    }
    
}
