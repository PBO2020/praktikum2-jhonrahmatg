/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumjon;

import java.util.ArrayList;
import java.util.Scanner;
public class Praktikumjon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner rcs = new Scanner(System.in);
 
        ArrayList<String> Kopi = new ArrayList<String>();
        ArrayList<String> Topping = new ArrayList<String>();
        ArrayList<String> Asal = new ArrayList<String>();
 
        MesinKopi Arabica = new MesinKopi();
        Arabica.setKopi("Vietnam Drip");
        Arabica.setAsal("Vietnam");
        Kopi.add(Arabica.getKopi());
        Asal.add(Arabica.getAsal());
 
        MesinKopi Robusta = new MesinKopi();
        Robusta.setKopi("Robusta");
        Robusta.setAsal("Italia");
        Kopi.add(Robusta.getKopi());
        Asal.add(Robusta.getAsal());
 
        MesinKopi Florest = new MesinKopi();
        Florest.setKopi("Sidikalang");
        Florest.setAsal("sidikalang");
        Kopi.add(Florest.getKopi());
        Asal.add(Florest.getAsal());
 
        koppi ryan = new koppi();
        ryan.setKoppi("Americano");
        Topping.add(ryan.getTopping());
        ryan.setKoppi("Cream");
        Topping.add(ryan.getTopping());
 
        try {
 
            System.out.println("==============Daftar Kopi===============");
            for (int i = 0; i < Kopi.size(); i++) {
                int j = i + 1;
                System.out.println("[" + j + "] Kopi " + Kopi.get(i) + " Asal " + Asal.get(i));
            }
 
            System.out.print("Pilih Kopi : ");
            int pilihkopi = rcs.nextInt() - 1;
            System.out.println("=======================================");
 
            for (int i = 0; i < Topping.size(); i++) {
                int j = i + 1;
                System.out.println("[" + j + "] Topping " + Topping.get(i));
            }
 
            System.out.print("Pilih Topping : ");
            int pilihtopping = rcs.nextInt() - 1;
            System.out.println("========================================");
 
            System.out.println("Pesanan anda adalah Kopi " + Kopi.get(pilihkopi) + " \nberasal dari " + Asal.get(pilihkopi) + " dengan Topping " + Topping.get(pilihtopping));
 
        } catch (Exception x) {
            System.out.println("Inputan Salah !");
            System.out.println(x + "\n");
        }
 
    }
    }
    

