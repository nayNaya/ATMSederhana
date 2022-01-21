/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.ArrayList;

/**
 *
 * @author nay
 */

//Encapsulasi
public class Bank {
    //daftar nasabah
    private ArrayList<Nasabah> listNasabah;
   
   //Construktor dijalankan masuk disini    
    
    private Bank() {
        listNasabah = new ArrayList<>();
    }
    
    //method buat listnasabah (ngembalikan ArrayList berisi class nasabah, return ListNasabah)
    public ArrayList<Nasabah> getListNasabah() {
        return listNasabah;
    }
    
    //List selalu terbaru
    public void setListNasabah(ArrayList<Nasabah> listNasabah) {
        this.listNasabah = listNasabah;
    }
    
    //sinkronisasi untuk memastikan keamanan thread
    //Artinya, pertama kali getInstance dipanggil, InstanceHolder akan dimuat dan instance akan dibuat, dan karena ini dikontrol oleh ClassLoaders, tidak diperlukan sinkronisasi tambahan.
   
    public static Bank getInstance() {
        return BankHolder.INSTANCE;
    }
    
    //
    private static class BankHolder {
        private static final Bank INSTANCE = new Bank();
    }
    
    public ArrayList<Nasabah> getList(){
         return Bank.getInstance().getListNasabah(); 
    }
}

