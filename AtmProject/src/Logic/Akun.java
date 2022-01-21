/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author nay
 */
public class Akun {
    String nomorRekening;
    String pin;
    int saldo;
    private int minSaldo;

   
    public Akun(String nomorRekening, String pin, int saldo) {
        this.nomorRekening = nomorRekening;
        this.pin = pin;
        this.saldo = saldo;
        this.setMinSaldo(0);
    }
    //Encapsulasi
    
    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }
    public String getNomorRekening() {
        return nomorRekening;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
      public String getPin() {
        return pin;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public int getSaldo() {
        return saldo;
    }
    
    public void setMinSaldo(int minSaldo) {
        this.minSaldo = minSaldo;
    }
    
    public int getMinSaldo() {
        return minSaldo;
    }
}
