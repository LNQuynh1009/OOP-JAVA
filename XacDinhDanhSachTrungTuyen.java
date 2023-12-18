/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package XacDinhDanhSachTrungTuyen;
import java.util.Scanner;
/**
 *
 * @author QUYNH
 */

class HS{
    private String id, name;
    private double ut, sum;
    public String status;

    public HS(Scanner sc) {
        id = sc.next();
        sc.nextLine();
        name = sc.nextLine();
        double t = sc.nextDouble();
        double l = sc.nextDouble();
        double  h = sc.nextDouble();
        if(id.startsWith("KV1")){
            ut = 0.5;
        }
        else if(id.startsWith("KV2")){
            ut = 1.0;
        }
        else ut = 2.5;
        sum = t*2+l+h+ut;
    }
    public double getSum() {
        return sum;
    }
    public boolean check(double x){
        return sum>=x;
    }
    public boolean cmp(HS o){
        if(o.sum == sum){
            return o.id.compareTo(id) < 1;
        }
        return o.sum > sum;
    }
    public void in(){
        System.out.print(id + " " + name + " ");
        if((ut*10)%10 != 0){
            System.out.printf("%.1f ", ut);
        }
        else System.out.printf("%.0f ", ut);
        if((sum*10)%10 != 0){
            System.out.printf("%.1f ", sum);
        }
        else System.out.printf("%.0f ", sum);
        System.out.println(status);
    }
}

public class XacDinhDanhSachTrungTuyen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HS[] a = new HS[n];
        for(int i = 0; i < n; i++){
            a[i] = new HS(sc);
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i; j < n; j++){
                if(a[i].cmp(a[j])){
                    HS tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        int ct = sc.nextInt();
        double dc = a[ct-1].getSum();
        System.out.printf("%.1f\n", dc);
        for(int i = 0; i < n; i++){
            if(a[i].check(dc)){
                a[i].status = "TRUNG TUYEN";
                a[i].in();
            }
            else{
                a[i].status = "TRUOT";
                a[i].in();
            }
        }
    }
    
}

/*
2
KV2A002
Hoang Thanh Tuan
5
6
5
KV3B123
Ly Thi Thu Ha
8
6.5
7
1
*/