/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HoaDonTienNuoc;
import java.util.Scanner;
/**
 *
 * @author QUYNH
 */

class KH{
    private static int cur = 1;
    private String id, name;
    private long sum;

    public KH(Scanner sc) {
        id = "KH" + String.format("%02d", cur++);
        name = sc.nextLine();
        long cu = sc.nextLong();
        long moi = sc.nextLong();
        long n = moi-cu;
        long res = 0;
        if(n > 50){
            res = 50*100;
            if(n > 100){
                res += 50*150;
                res += (n-100)*200;
                res = Math.round(res*1.05);
            }else{
                res += (n-50)*150;
                res = Math.round(res*1.03);
            }
        }
        else{
            res = n*102;
        }
        sum = res;
    }
    public boolean cmp(KH o){
        return sum < o.sum;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sum;
    }
}

public class HoaDonTienNuoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        KH[] a = new KH[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            a[i] = new KH(sc);
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i; j < n; j++){
                if(a[i].cmp(a[j])){
                    KH tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
    
}

/*
3
Le Thi Thanh
468
500
Le Duc Cong
160
230
Ha Hue Anh
410
612
*/