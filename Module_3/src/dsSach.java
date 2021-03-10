import java.util.ArrayList;
import java.util.Iterator;

public class dsSach {
    ArrayList<Sach> Sachs;

    public dsSach() {
        Sachs = new ArrayList<Sach>();
    }

    public dsSach(ArrayList<Sach> sachs) {
        Sachs = sachs;
    }

    public ArrayList<Sach> getSachs() {
        return Sachs;
    }

    public void setSachs(ArrayList<Sach> sachs) {
        Sachs = sachs;
    }

    public void luuTatCaVaoFile(){
        for (Sach sach :
                Sachs) {
            sach.luuVaoFile();
        }
    }


}
