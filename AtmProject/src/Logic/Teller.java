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
//Inheritance

public class Teller extends Controller {
    
    public Teller(){
        super(new Nasabah());
    }
    
    public Teller(Nasabah nasabah)
    {
        super(nasabah);
    }
    
    @Override
    //tidak pake pengecekan (tdk ada batasan)
    public int withdraw (int mount){
        getNasabah().getAkun().setSaldo(getNasabah().getAkun().getSaldo() - mount);
        return getNasabah().getAkun().getSaldo();
    }
    @Override
    //method transfer di nasabah
    public void transfer(Nasabah nasabah, int mount)
    {
        getNasabah().transfer(nasabah, mount);
    }
    
    //nasabah baru dari teller langsung ada atm
    public void addNasabah(String nama,String NomorKtp, String nomorRekening , String pin ,int saldo , String akun)
    {
        //polimorphis
        Akun newAkun = null;
        if (akun.equals("AkunPlatinum"))
            newAkun = new AkunPlatinum(nomorRekening, pin, saldo);
        else if(akun.equals("AkunGold"))
            newAkun = new AkunGold(nomorRekening, pin , saldo);
        else
            newAkun = new AkunReguler(nomorRekening , pin , saldo);
        
        // buat nasabahnya
        Nasabah newNasabah = new Nasabah(nama ,NomorKtp , new Akun(nomorRekening, pin, saldo));
        //masuk assaylistnya
        newNasabah.save();
        
    }
    //buat delete nasabah
    public void delete()
    {
        getNasabah().delete();
    }
        
    @Override
    public Nasabah validate(String akunNumber , String password){
        try{
           int i = 0;
            /*selama akunNumber belum ada, maka mencari dilakukan terus whilenya
            sampai menemukan NomorRekening*/
           while(!akunNumber.equals(Bank.getInstance().getListNasabah()
                   .get(i).getAkun().getNomorRekening()))
               i++;
           if(password.equals(Bank.getInstance().getListNasabah().get(i)
                   .getNomorKtp()))
               return Bank.getInstance().getListNasabah().get(i);
        }catch(Exception e){
            
        }
            return null;
    }
}
