import java.util.Scanner;;
public class Gach {
    private String mso;
    private String mau;
    private int sluong, cdai, cngang;
    private long gia;
    public Gach(){
        mso = new String();
        mau = new String();
        sluong = 0;
        cdai = 1;
        cngang = 1;
        gia = 0;
    }
    public Gach(Gach g){
        mso = new String(g.mso);
        mau = new String(g.mau);
        sluong = g.sluong;
        cdai = g.cdai;
        cngang = g.cngang;
        gia = g.gia;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        
    }
}

