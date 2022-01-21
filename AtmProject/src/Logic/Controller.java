/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author nay
 */

public abstract class Controller {
    private Nasabah nasabah;
    
    public Controller(Nasabah nasabah) {
        this.nasabah = nasabah;
    }
    //Encapsulasi
    public void setNasabah(Nasabah nasabah) {
        this.nasabah = nasabah;
    }
    public Nasabah getNasabah() {
        return nasabah;
    }
    
    protected void hasilValidate(Nasabah nasabah){
        this.nasabah=nasabah;
    }

    public int checkDeposit(){
      return nasabah.check();
    }
    
    public void saving(int mount){
        nasabah.saving(mount);
    }
    
    
    public Nasabah cekTransfer(String akunDestinasi){
        try{
            int i = 0;
            //cari nomer rekening tujuan
            //selama akun destinasi belum cari dilakukan terus whilenya sampai menemukan NomorRekening
            while(!akunDestinasi.equals(getNasabah().getList().get(i).getAkun().getNomorRekening()))
                i++;
            //ngembalikan nasabah dengan akun destinasi
            return getNasabah().getList().get(i);
            
            //kalo akun tidak ditemukan, destinasi salah
        }catch(Exception e){
            Component parentComponent = null;
            JOptionPane.showMessageDialog(parentComponent,"Destinasi Anda Salah","Akun tidak Valid",JOptionPane.WARNING_MESSAGE);
        }
        //kalo tdk menemukan nasabah, mengembalikan list nasabahnya
        Nasabah nasabah = new Nasabah();
        return nasabah;
    }
    //Overriden
    //check login
    public abstract Nasabah validate(String akunNumber , String password);
    
    //setor
    public abstract int withdraw (int mount);
    
    //Overriden
    //transfer
    public abstract void transfer(Nasabah nasabah , int mount);
}
