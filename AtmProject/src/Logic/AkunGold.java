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

//inheritance
public class AkunGold extends Akun {
    public AkunGold(String nomorRekening, String pin, int saldo){
        
        //manggil construktor akun
        super(nomorRekening,pin, saldo);
    }
}
