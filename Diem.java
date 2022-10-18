import java.util.Scanner;
public class Diem {
    int x;
    int y;
    Diem (){
        x = y = 0;
    }
    Diem (int x, int y){
        this.x = x;
        this.y = y;
    }
    public void nhapDiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap toa do x = ");
        x = sc.nextInt();
        System.out.println("Nhap hoanh do y = ");
        y = sc.nextInt();
    }
    public void hienThi(){
        System.out.println("(" + x + "," + y +")");
    }
    public void doiDiem(int dx, int dy){
        x+=dx;
        y+=dy;
    }
    public int giaTriX(){
        return x;
    }
    public int giaTriY(){
        return y;
    }
    public float khoangCach(){
        return (float)Math.sqrt(x*x + y*y);
    }
    public float khoangCach(Diem d){
        return (float)Math.sqrt((x-d.x)*(x-d.x) + (y-d.y)*(y-d.y));
    }
}