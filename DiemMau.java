import java.util.Scanner;
public class DiemMau extends Diem{
private String mau;

public DiemMau() {
	super();
	mau= new String();
}

public DiemMau(int x,int y, String mau) {
	super(x,y);
	this.mau=mau;
}

public DiemMau(DiemMau dmau) {
	super();
	mau= dmau.mau;
}

public void GanMau(String mau) {
	this.mau=mau;
}

public void nhap() {
	nhapDiem();
	Scanner sc=new Scanner(System.in);
	System.out.println("Nhap mau: ");
	mau=sc.nextLine();
}

public void hienThi() {
	super.hienThi();
	System.out.println("Mau la: "+mau);
}
}