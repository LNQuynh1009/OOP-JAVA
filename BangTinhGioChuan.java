/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BangTinhGioChuan;
import java.util.Scanner;
/**
 *
 * @author QUYNH
 */

class MH{
    public String id, name;

    public MH(Scanner sc) {
        id = sc.next();
        name = sc.nextLine().trim();
    }
    public MH() {
    }
}

class GV extends MH{
    public String ma, ten;
    public double g;

    public GV(Scanner sc) {
        ma = sc.next();
        ten = sc.nextLine().trim();
        g = 0;
        this.name = "";
    }
    public void in(){
        String[] res = this.name.split("/");
        System.out.println("Giang vien: " + this.ten + " ");
        for(String i : res){
            System.out.println(i);
        }
        System.out.printf("Tong: %.2f\n", this.g);
    }
}

public class BangTinhGioChuan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MH[] a = new MH[n];
        for(int i = 0; i < n; i++){
            a[i] = new MH(sc);
        }
        int m = sc.nextInt();
        GV[] b = new GV[m];
        for(int i = 0; i < m; i++){
            b[i] = new GV(sc);
        }
        int q = sc.nextInt();
        while(q-- > 0){
            String gv =  sc.next();
            String mh = sc.next();
            for(int i = 0; i < n; i++){
                if(a[i].id.equals(mh)){
                    mh = a[i].name;
                    break;
                }
            }
            double h = sc.nextDouble();
            for(int i = 0; i < m; i++){
                if(b[i].ma.equals(gv)){
                    b[i].name += mh+" "+ String.valueOf(h)+ "/";
                    b[i].g += h;
                    break;
                }
            }
        }
        String gv = sc.next();
        for(int i = 0; i < m; i++){
            if(b[i].ma.equals(gv)){
                b[i].in();
                break;
            }
        }
    }
    
}

/*
2
INT1155 Tin hoc co so 2
INT1306 Cau truc du lieu va giai thuat
2
GV01 Nguyen Van An
GV02 Hoang Binh Minh
3
GV01 INT1155 113.2
GV02 INT1306 126.72
GV01 INT1306 78.1
GV01
*/