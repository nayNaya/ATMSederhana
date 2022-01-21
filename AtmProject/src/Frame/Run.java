package Frame;
import Frame.MenuUtamaFrame;
import Logic.AkunGold;
import Logic.AkunReguler;
import Logic.Nasabah;

/**
 *
 * @author nay
 */
public class Run {
    public static void main(String[] args)
    {
        Nasabah nasabah1 = new Nasabah("Geluh","2110191023",new AkunReguler("2110191023","123",1000000));
        nasabah1.save();
        Nasabah nasabah2 = new Nasabah("Tanaya","2110191123",new AkunGold("2110191123","123",2000000));
        nasabah2.save();
        new MenuUtamaFrame().setVisible(true);
    }
}
