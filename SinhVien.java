
import java.util.Scanner;
public class SinhVien {
	 private String mssv;
	 private String hoTen;
	 private Date ngSinh;
	 private int sluong;
	 private String ten[];
	 private String diem[];
	 public SinhVien () {
		 mssv = new String();
		 hoTen = new String();
		 ngSinh = new Date();
		 sluong = 0;
		 ten = new String[100];
		 diem = new String[100];
	 }
	 public SinhVien (SinhVien s) {
		 mssv = new String (s.mssv);
		 hoTen = new String (s.hoTen);
		 sluong = s.sluong;
		 ten = new String[100];
		 diem = new String[100];
		 for (int i=0;i<sluong;i++) {
			 ten[i]=new String (s.ten[i]);
			 diem[i]=new String (s.diem[i]);
		 }
	 }
	 public void nhapThongTin() {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Nhap mssv: ");
		 mssv = sc.nextLine();
		 System.out.println("Nhap ho ten: ");
		 hoTen = sc.nextLine();
		 System.out.println("Nhap ngay sinh: ");
		 ngSinh.nhapNgay();
	 }
	 public void nhapDiem() {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Nhap so mon hoc: ");
		 sluong = sc.nextInt();
		 sc.nextLine();
		 for (int i=0;i<sluong;i++) {
			 System.out.println("Nhap mon hoc thu "+(i+1)+":");
			 ten[i]=sc.nextLine();
			 System.out.println("Nhap diem mon "+ten[i]+":");
			 diem[i]=sc.nextLine();
		 }
	 }
	 public String toString () {
		 String s = "["+mssv+","+hoTen+","+ngSinh+"]";
		 for (int i=0;i<sluong;i++)
			 s += ","+ten[i]+":"+diem[i];
		 return s;
	 }
	 public float dtb() {
		 float f = 0.0f;
		 for (int i=0;i<sluong;i++) {
			 if (diem[i].equals("A")) f+=4;
			 else if (diem[i].equals("B+")) f+=3.5;
			 else if (diem[i].equals("B")) f+=3;
			 else if (diem[i].equals("C+")) f+=2.5;
			 else if (diem[i].equals("C")) f+=2;
			 else if (diem[i].equals("D+")) f+=1.5;
			 else if (diem[i].equals("D")) f+=1;
			 else f+=0.5;
		 }
		 return f/sluong;
	 }
	 public void dky (String mon, String d) {
		 if(sluong<ten.length-1) {
			 for(int i=0;i<sluong;i++) {
				 ten[i]=new String(mon);
				 diem[i]=new String(d);
				 sluong++;
			 }
	 	}
		 else
			 System.out.println("Mang day, khong the them mon hoc");
	 }
	 public void xoa(String mon) {
		 int i=0;
		 for (i=0;i<sluong;i++)
			 if (ten[i].equals(mon)) break;
		 if (i<sluong) {
			 for (int j=i+1;j<sluong;j++) {
				 ten[j]=new String (ten[j+1]);
				 diem[j]=new String (diem[j+1]);
			 }
		 }
		 sluong--;
	 	}
	 public String layTen(){
		int kt = hoTen.trim().lastIndexOf(" ");
		return hoTen.trim().substring(kt+1);
	 }
}