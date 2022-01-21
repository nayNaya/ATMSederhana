
package Logic;


import java.awt.Component;
import java.util.concurrent.ExecutionException;
import javax.swing.JOptionPane;

/**
 *
 * @author nay
 */

//Inheritance
public class ATM extends Controller  {

    //construktor manggil di controll
    public ATM(Nasabah nasabah) {
        super(nasabah);
    }
    //tidak bawa paremeter, intansiasi new nasabah
    public ATM()
    {
        super(new Nasabah());
    }
    
    @Override
    public int withdraw(int mount)
    {
             Component rootPane = null;
            
        if(getNasabah().getAkun() instanceof AkunPlatinum && mount<= 15000000)
              getNasabah().withdraw(mount);
           
        else if (getNasabah().getAkun() instanceof AkunGold &&mount <= 10000000)
              getNasabah().withdraw(mount);
            
        else if(getNasabah().getAkun() instanceof AkunReguler && mount <= 5000000)
             getNasabah().withdraw(mount);
        else{
            
            if(getNasabah().getAkun() instanceof AkunPlatinum)
                JOptionPane.showMessageDialog(rootPane,"Batas Transaksi Anda "
                        + "Rp15000000","Akun Anda Platinum",JOptionPane.
                                WARNING_MESSAGE);
            else if(getNasabah().getAkun() instanceof AkunGold)
                JOptionPane.showMessageDialog(rootPane,"Batas Transaksi Anda "
                        + "Rp10000000","Akun Anda Gold",JOptionPane.
                                WARNING_MESSAGE);
            else if(getNasabah().getAkun() instanceof AkunReguler)
                JOptionPane.showMessageDialog(rootPane,"Batas Transaksi Anda "
                        + "Rp5000000","Akun Anda Reguler",JOptionPane.
                                WARNING_MESSAGE);
        }
        
        return getNasabah().getAkun().getSaldo();
    }
    
    //check jumlah
    private boolean checkTransfer(int mount)
    {
        //ckeTransfer di parent
        Component parentComponent = null ;
        //jumlah transfer kurang dari bisa transfer
        // akan mengembalikan nilai benar jika objek memang instance/anggota dari class tertentu
        if(getNasabah().getAkun() instanceof AkunPlatinum && mount <=40000000)
            return true ;
        else if (getNasabah().getAkun() instanceof AkunGold && mount <=25000000)
            return true ;
        else if (getNasabah().getAkun() instanceof AkunReguler && mount <=10000000)
            return true ;
        else 
            JOptionPane.showMessageDialog(parentComponent, "Kartu Anda tidak mendukung jumlah transaksi ini","Not Allowed",JOptionPane.WARNING_MESSAGE);
        return false;
    }
    
  

    @Override
    public void transfer(Nasabah nasabah , int mount){
        if(checkTransfer(mount))
                getNasabah().transfer(nasabah, mount);
    }
     @Override
    public Nasabah validate(String rekening , String pin){
        try{
           int i = 0;
           while(!rekening.equals(Bank.getInstance().getListNasabah().get(i).getAkun().getNomorRekening()))
               i++;
           if(pin.equals(Bank.getInstance().getListNasabah().get(i).getAkun().getPin()))
               return Bank.getInstance().getListNasabah().get(i);
        }catch(Exception e){
            
        }
        return null;
    }
}
