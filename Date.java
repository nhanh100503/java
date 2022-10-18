
import java.util.Scanner;
public class Date {
	private int ngay;
	private int thang;
	private int nam;
	Date(){
		ngay = thang = nam = 1;
	}
	Date(int d, int m, int y){
		ngay = d;
		thang = m;
		nam = y;
	}
	public void hienThi() {
		System.out.println(ngay + "/" + thang + "/" + nam);
	}
	public String toString(){
		return (ngay + "/" + thang + "/" + nam);
	}
	public void nhapNgay() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap ngay: ");
			ngay = sc.nextInt();
			System.out.println("Nhap thang: ");
			thang = sc.nextInt();
			System.out.println("Nhap nam: ");
			nam = sc.nextInt();
			if(!this.hopLe()) {
				System.out.println("Ngay thang khong hop le, xin nhap lai:");
			}
		}while(!this.hopLe());
	}
	public boolean hopLe() {
		int ngayTrongThang[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(nam % 400 == 0 || (nam % 4 == 0 && nam % 100!=0 ));
			ngayTrongThang[2]=29;
			
		if(thang < 1 || thang > 12) {
			return false;
		}else {
			return (ngay >= 1 && ngay <= ngayTrongThang[thang]);
		}
	}
	public Date ngayHomSau() {
		Date tomorrow = new Date();
		int ngayTrongThang[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(nam % 400 == 0 || (nam % 4 == 0 && nam % 100!=0 ));
			ngayTrongThang[2]=29;
			
		if(ngay >= 1 && ngay < ngayTrongThang[thang]) {
			tomorrow.ngay = ngay + 1;
			tomorrow.thang = thang;
			tomorrow.nam = nam;
		}else {
			tomorrow.ngay = 1;
			tomorrow.thang = thang + 1;
			tomorrow.nam = nam;
		}
		
		if(tomorrow.thang == 13) {
			tomorrow.thang = 1;
			tomorrow.nam = nam + 1;
		}
		return tomorrow;
	}
	public Date congNgay(int n) {
		Date d = new Date(ngay, thang, nam); 
		for(int i = 0; i < n; i++) {
			d = d.ngayHomSau();
		}
		return d;
	}
}

