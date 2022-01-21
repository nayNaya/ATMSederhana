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

//buat akun login
public class Nasabah {
    private String id;
    //private String ID;
    private String nama;
    private String NomorKTP;
    //private String NomorKTP;
    private Akun akun ;
    private DataAccessObject dataNasabah = new DataAccessObject();
    
   //construktor masukkan
    public Nasabah(String nama, String NomorKTP, Akun akun) {
        this.nama = nama;
        this.NomorKTP = NomorKTP;
        this.akun = akun;
    }
    
 
    public Nasabah(){
        //waktu new nasabah bisa dijalankan 
    }
     
     //Encapsulasi
    public String getId() {
        return id;
    }

    /*
     public String getID() {
        return id;
    }
    */
 
    public void setID() {
        //id dibuat secara otomatis
        this.id = String.valueOf(this.getList().size()+1);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorKtp() {
        return NomorKTP;
    }
    /*
    public String getNomorKTP() {
        return NomorKtp;
    }
    */
    public void setNomorKtp(String NomorKtp) {
        this.NomorKTP = NomorKtp;
    }
    
    public Akun getAkun() {
        return akun;
    }

    public void setAkun(Akun akun) {
        this.akun = akun;
    }
    
    public void withdraw(int mount){
        getAkun().setSaldo(getAkun().getSaldo() - mount);
    }
    
    public int check(){
        return getAkun().getSaldo();
    }
    
    public void saving(int mount){
        getAkun().setSaldo(getAkun().getSaldo() + mount);
    }
    
    public void transfer(Nasabah nasabah, int mount){
        //nomor rekening tujuan -> nasabah nasabah
        //mount ->jumlahnya
        
        this.withdraw(mount);
        nasabah.getAkun().setSaldo(nasabah.getAkun().getSaldo()+ mount);
    }
    
    //save/delete list yang ada dinasabah
    public void save(){
        dataNasabah.getList().add(this);
    }
    public void delete(){
        dataNasabah.getList().remove(this);
    }
    
    public ArrayList<Nasabah> getList(){
        return dataNasabah.getList();
    }

}
