/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Latihan
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int angkatan, biaya, harga, harga1, sks, sks1, tetap, total;
            String fakultas, jenis;
            System.out.println("masukkan tahun angkatan anda=");
            angkatan= scan.nextInt();
            if (angkatan<=2018)
            {
                tetap = 5000000;
                System.out.println("pembayaran sepaket 24 sks sebesar"+tetap);
            }
            else if (angkatan>=2019) 
            {
                System.out.println("masukkan fakultas anda(1. Fti, 2, Ft, 3. Fh, 4. Fe&Fpsi)=");
                fakultas= scan.next();
                if("fti".equalsIgnoreCase(fakultas))
                {
                    biaya= 2500000;
                    System.out.println("biaya yang akan dibayar"+biaya);
                    System.out.println("masukkan jenis mata kuliah(tatapmuka, praktikum)=");
                    jenis=scan.next();
                    {
                        if ("tatapmuka".equalsIgnoreCase(jenis))
                        {
                            System.out.println("masukkan jumlah sks anda=");
                            sks= scan.nextInt();
                            tetap= 5000000;
                            harga=100000*sks;
                            total= biaya+harga+tetap;
                            System.out.println("biaya yang akan anda bayar"+total);
                        }
                        else if ("praktikum".equalsIgnoreCase(jenis)) 
                        {
                             System.out.println("masukkan jumlah sks anda=");
                            sks= scan.nextInt();
                            tetap= 5000000;
                            harga=150000*sks;
                            total= biaya+harga+tetap;
                            System.out.println("biaya yang akan anda bayar"+total);
                        }
                    }
                }
                else if ("Ft".equalsIgnoreCase(fakultas)) 
                {
                    biaya= 2250000;
                    System.out.println("biaya yang akan dibayar"+biaya);
                    System.out.println("masukkan jenis mata kuliah(tatapmuka, praktikum)=");
                    jenis=scan.next();
                    {
                        if ("tatapmuka".equalsIgnoreCase(jenis))
                        {
                            System.out.println("masukkan jumlah sks anda=");
                            sks= scan.nextInt();
                            tetap= 5000000;
                            harga=100000*sks;
                            total= biaya+harga+tetap;
                            System.out.println("biaya yang akan anda bayar"+total);
                        }
                        else if ("praktikum".equalsIgnoreCase(jenis)) 
                        {
                             System.out.println("masukkan jumlah sks anda=");
                            sks= scan.nextInt();
                            tetap= 5000000;
                            harga=150000*sks;
                            total= biaya+harga+tetap;
                            System.out.println("biaya yang akan anda bayar"+total);
                        }
                    }
                }
                else if ("Fh".equalsIgnoreCase(fakultas)) 
                {
                    tetap= 5000000;
                    biaya= 2275000;
                    total= biaya+tetap;
                    System.out.println("biaya diluar sks adalah"+biaya);
                    System.out.println("biaya total dengan sks adalah"+total);
                }
            
                else if ("Fe&Fpsi".equalsIgnoreCase(fakultas)) 
                {
                    tetap= 5000000;
                    biaya= 2150000;
                    total= biaya+tetap;
                    System.out.println("biaya diluar sks adalah"+biaya);
                    System.out.println("biaya total dengan sks adalah"+total);
                }
                }
    
}
}
