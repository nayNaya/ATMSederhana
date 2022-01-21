/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Logic.ATM;
import Logic.Teller;
import Logic.Nasabah;
import javax.swing.JFrame;

/**
 *
 * @author nay
 */

public class FrameDasar extends javax.swing.JFrame{
    private ATM atmControll;
    private Teller tellerControll;
    private Nasabah nasabah;

    
    public FrameDasar()
    {
        this.atmControll = new ATM();
        this.tellerControll = new Teller();
        
    }
    
    public FrameDasar(Nasabah nasabah )
    {
        this.nasabah = nasabah ;
        this.atmControll = new ATM(nasabah);
        this.tellerControll = new Teller(nasabah);
        
    }
    
    protected void changeFrame(Object obj)
    {
        JFrame frame = (JFrame) obj ;
        frame.setVisible(true );
        this.dispose();
    }
    
    //Encapsulasi
    public ATM getAtmControll() {
        return atmControll;
    }

    public Teller getTellerControll() {
        return tellerControll;
    }

    public Nasabah getNasabah() {
        return nasabah;
    } 
}
